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

 Created by asitha on 9/1/2019.
 -----------------------------------------------------------------------*/
public class WordLengthFilter implements Filter<String>{
    private int length;

    public WordLengthFilter(int length)
    {
        this.length = length;
    }


    public List filt(List<String> list,String c) {
        List<String> nList = new ArrayList<String>();
        for (String word: list ) {
            if(word.length() == length ){
                nList.add(word);
            }

        }

        return nList;

    }
}