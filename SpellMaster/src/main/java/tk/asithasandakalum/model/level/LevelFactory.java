package tk.asithasandakalum.model.level;

import tk.asithasandakalum.model.Factory;
import tk.asithasandakalum.model.exception.GameOverException;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by Asitha Sandakalum on 9/13/2019
 -----------------------------------------------------------------------*/
public  class LevelFactory implements Factory {

    public static Level getLevel(int level){
        switch (level) {
            case 1: return new LevelOne();
            case 2: return new LevelTwo();
            case 3: return new LevelTree();
            case 4: return new LevelFore();
            case 5: return new LevelFive();
        }
        throw  new GameOverException("Finish the All Level");
    }

}
