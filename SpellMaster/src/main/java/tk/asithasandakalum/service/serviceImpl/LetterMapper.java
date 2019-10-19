package tk.asithasandakalum.service.serviceImpl;

import tk.asithasandakalum.service.Mapper;

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
public class LetterMapper implements Mapper<Character> {


    public List<Character> makeWord(List<Character> word, Character c, List<Integer> list) {

        for (int i:list) {
            word.set(i,c);
        }

        return word;
    }
}