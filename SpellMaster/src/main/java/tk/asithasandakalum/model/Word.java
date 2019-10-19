package tk.asithasandakalum.model;

import tk.asithasandakalum.model.exception.GameOverException;
import tk.asithasandakalum.model.exception.GameWordCompleteException;
import tk.asithasandakalum.service.Mapper;
import tk.asithasandakalum.service.Filter;

import java.util.ArrayList;
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
public class Word {

    private List<Character> oWord;
    private List<Character> word = new ArrayList<Character>();
    private Filter filter;
    private Mapper mapper;
    private int attampt;


    public Word(List<Character> oWord, Filter filter, Mapper mapper, int attampt) {
        this.oWord = oWord;
        this.filter = filter;
        this.mapper = mapper;
        this.attampt = attampt;

        this.word.add(oWord.get(0));
        for (int i = 1; i <= oWord.size() - 1; i++) {
            word.add(i, '-');
        }


    }

    public List<Character> getFilledWord(Character character) throws GameWordCompleteException {


        if (attampt < 1)
            throw new GameOverException("No attempts are remaining.");

        List<Integer> intList = filter.filt(oWord, character);

        if (intList.size() > 0 ) {
            word = mapper.makeWord(word, character, intList);
        }
        else {
            attampt--;
        }

        if (filter.filt(word, '-').isEmpty())
            throw new GameWordCompleteException("Allready Fill the Word.");

        return word;


    }

    public int getAttampt() {
        return attampt;
    }

    public List<Character> getWord() {
        return word;
    }
}