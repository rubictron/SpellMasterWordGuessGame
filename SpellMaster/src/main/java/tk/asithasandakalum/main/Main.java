package tk.asithasandakalum.main;


import tk.asithasandakalum.controller.GameController;
import tk.asithasandakalum.view.ConsoleUi;

import java.io.IOException;



/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by asitha on 8/29/2019.
 -----------------------------------------------------------------------*/

public class Main {


    public static void main(String[] args) throws IOException {

        GameController gameController = new GameController(new ConsoleUi());
        gameController.startGame();
        gameController.runGame();




    }

}