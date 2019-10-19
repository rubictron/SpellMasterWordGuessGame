package tk.asithasandakalum.view;

import java.util.List;

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
public interface Ui{
    void start();
    char getUserInput();
    void showWord(List word);
    void exit();
    void showMessage(String msg);
    void gameOver();
}