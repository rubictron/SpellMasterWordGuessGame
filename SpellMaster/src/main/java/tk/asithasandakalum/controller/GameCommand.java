package tk.asithasandakalum.controller;

import tk.asithasandakalum.model.Word;
import tk.asithasandakalum.service.Validater;
import tk.asithasandakalum.model.exception.InputNotValidException;
import tk.asithasandakalum.view.Ui;

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
public class GameCommand implements Command {

    private Word word;
    private Ui ui;
    private Validater validater;

    public GameCommand(Word word, Ui ui, Validater validater) {
        this.word = word;
        this.ui = ui;
        this.validater = validater;
    }

    public void execute() {

        ui.showMessage("You have " +  word.getAttampt() + " Attempts more");
        ui.showMessage("Enter a character :");
        char letter = ui.getUserInput();
        if (validater.validate(letter+"")){
            letter = (letter+"").toUpperCase().toCharArray()[0];
        }
        else{
            throw new InputNotValidException("InputNotValidException");
        }
        ui.showWord(word.getFilledWord(letter));


    }
}