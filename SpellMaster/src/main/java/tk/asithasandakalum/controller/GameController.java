package tk.asithasandakalum.controller;

import tk.asithasandakalum.model.exception.CantFindWordException;
import tk.asithasandakalum.model.exception.GameOverException;
import tk.asithasandakalum.model.exception.GameWordCompleteException;
import tk.asithasandakalum.model.level.Level;
import tk.asithasandakalum.model.level.LevelFactory;
import tk.asithasandakalum.repository.RandomWord;
import tk.asithasandakalum.repository.repositoryImpl.HttpDataSource;
import tk.asithasandakalum.repository.repositoryImpl.RandomWordImpl;
import tk.asithasandakalum.repository.DataSource;
import tk.asithasandakalum.repository.repositoryImpl.TextDataSource;
import tk.asithasandakalum.service.Validater;
import tk.asithasandakalum.service.serviceImpl.CharValidater;
import tk.asithasandakalum.model.exception.InputNotValidException;
import tk.asithasandakalum.service.serviceImpl.LetterFilter;
import tk.asithasandakalum.service.serviceImpl.LetterMapper;
import tk.asithasandakalum.model.*;
import tk.asithasandakalum.view.Ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by asitha on 9/1/2019.
 -----------------------------------------------------------------------*/
public class GameController {

    private GameCommand gameCommand;
    private Ui myUi;
    private Word word;
    private DataSource source;
    private RandomWord randomWord;
    private Validater validater = new CharValidater();
    private int wordsPerLevel = 1;
    private Level level;



    public GameController(Ui myUi) throws IOException {


            this.myUi = myUi;
            this.level = LevelFactory.getLevel(1);

//            source = new ClassDataSource();



        try {
            source = new HttpDataSource("http://localhost:8080/getData");
        } catch (IOException e) {
//            try {
//                source = new TextDataSource(new FileInputStream(
//                        ClassLoader.getSystemClassLoader().getResource("wordListData.txt").getPath()));
//            } catch (FileNotFoundException ex) {
//                ex.printStackTrace();
//            }
        }

        randomWord = new RandomWordImpl(source);


    }

    public void startGame() {
        myUi.start();
        newWord(level);
    }


    public void runGame() {


        int wordNo = wordsPerLevel;

        while (wordNo >= 0) {

            try {
                gameCommand.execute();
            } catch (GameWordCompleteException exce) {
                myUi.showMessage("You Complete The Word ");
                myUi.showWord(word.getWord());
                wordNo--;
                if (wordNo > 0)
                    newWord(level, word.getAttampt());
                else {

                    try {
                        myUi.showMessage("Win the Level");
                        level = LevelFactory.getLevel(level.getLevelNo() + 1);
                        newWord(level);
                        wordNo = wordsPerLevel;
                    }catch (GameOverException exp){
                        myUi.gameOver();
                    }

                }
            } catch (GameOverException exce) {
                myUi.gameOver();
            } catch (InputNotValidException exce) {
                myUi.showMessage("You Enter a invalid input please Enter a Character");
            }

        }


    }

    private void newWord(Level level) {
        newWord(level, level.getNoOfAttampts());
    }

    private void newWord(Level level, int attampt) {

        int wordLength = 0;

        List list = null;

        int c = 10000;
        for (int i = 0; i < c; i++) {
            if (wordLength == level.getWordLength()) {
                break;
            }
            if (i == c - 1) {
                throw new CantFindWordException("Cant find any word related to level");
            }
            list = randomWord.getRandom();
            wordLength = list.size();
        }


        this.word = new Word(list, new LetterFilter(), new LetterMapper(), attampt);
        this.gameCommand = new GameCommand(word, myUi, validater);
        myUi.showWord(word.getWord());

    }


}