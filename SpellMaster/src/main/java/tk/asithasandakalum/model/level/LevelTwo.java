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
public class LevelTwo implements Level {
    @Override
    public int getLevelNo() {
        return 2;
    }

    @Override
    public int getNoOfAttampts() {
        return 9;
    }

    @Override
    public int getWordLength() {
        return 5;
    }

}
