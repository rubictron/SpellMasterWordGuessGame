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
public class LevelFore implements Level{
    @Override
    public int getLevelNo() {
        return 4;
    }

    @Override
    public int getNoOfAttampts() {
        return 7;
    }

    @Override
    public int getWordLength() {
        return 7;
    }
}
