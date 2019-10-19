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
public class LevelFive implements Level {
    @Override
    public int getLevelNo() {
        return 5;
    }

    @Override
    public int getNoOfAttampts() {
        return 6;
    }

    @Override
    public int getWordLength() {
        return 8;
    }
}
