package tk.asithasandakalum.model.level;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by asitha on 9/11/2019.
 -----------------------------------------------------------------------*/
public class LevelOne implements Level {

    @Override
    public int getLevelNo() {
        return 1;
    }

    @Override
    public int getNoOfAttampts() {
        return 10;
    }

    @Override
    public int getWordLength() {
        return 4;
    }


}