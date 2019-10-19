package tk.asithasandakalum.repository.repositoryImpl;

import tk.asithasandakalum.repository.DataSource;
import tk.asithasandakalum.repository.RandomWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
public class RandomWordImpl implements RandomWord {

    DataSource source;

    public RandomWordImpl(DataSource source) {
        this.source = source;
    }

    public List getRandom() {


        List<String>  list= source.getData();

        Random randomGenerator = new Random();

        int randomInt = randomGenerator.nextInt(list.size());

        String word = list.get(randomInt);

        List<Character> arrayList = new ArrayList<Character>();

        for (char ch:   word.toCharArray() ) {
            arrayList.add(ch);
        }

        return arrayList;
    }
}