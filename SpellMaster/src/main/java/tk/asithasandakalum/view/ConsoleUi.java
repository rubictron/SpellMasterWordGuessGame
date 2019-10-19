package tk.asithasandakalum.view;
import tk.asithasandakalum.model.ConsoleColors;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Scanner;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by asitha on 8/26/2019.
 -----------------------------------------------------------------------*/
public class ConsoleUi implements Ui {


    public void start() {

        System.out.println(ConsoleColors.GREEN + "Guess The Word Improve Your Sailings Skill\n "
                + "You Have to Gees the Letters of given word\n" +ConsoleColors.RESET);

    }

    public char getUserInput() {

        Scanner in = new Scanner(System.in);
        return in.next().charAt(0);
    }


    public void showWord(List word) {
        System.out.println( ConsoleColors.RED);

        for (Object ch : word  ) {
            System.out.print(ch);

        }
        System.out.println(ConsoleColors.RESET );
    }


    public void exit() {

        System.out.println("*****Thank you for playing with RUBICTRON Guess THe Word***** \n" + ConsoleColors.RUBICTRON);

        System.exit(0);
    }

    public void showMessage(String msg) {
        System.out.println(ConsoleColors.YELLOW +   msg  + ConsoleColors.RESET);
    }

    public void gameOver() {
        exit();
    }



}