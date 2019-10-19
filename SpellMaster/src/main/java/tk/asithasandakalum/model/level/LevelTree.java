package tk.asithasandakalum.model.level;

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
public class LevelTree implements Level {
    @Override
    public int getLevelNo() {
        return 3;
    }

    @Override
    public int getNoOfAttampts() {
        return 8;
    }

    @Override
    public int getWordLength() {
        return 6;
    }
}
