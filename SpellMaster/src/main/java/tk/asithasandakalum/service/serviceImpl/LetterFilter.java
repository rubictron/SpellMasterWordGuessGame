package tk.asithasandakalum.service.serviceImpl;

import tk.asithasandakalum.service.Filter;

import java.util.ArrayList;
import java.util.List;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by asitha on 8/25/2019.
 -----------------------------------------------------------------------*/
public class LetterFilter implements Filter<Character> {



    public List<Integer> filt(List<Character> list, Character c) {

        List<Integer> intlist = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == c) {
                intlist.add(i);
            }
        }
        return intlist;
    }
}