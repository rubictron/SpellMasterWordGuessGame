package tk.asithasandakalum.repository.repositoryImpl;

import tk.asithasandakalum.repository.DataSource;

import java.io.*;
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

 Created by Asitha Sandakalum on 9/12/2019
 -----------------------------------------------------------------------*/

public class TextDataSource implements DataSource {

    private ArrayList<String> list= new ArrayList<String>();

    public TextDataSource(InputStream inputStream) throws IOException {


             BufferedReader inputFile = new BufferedReader(new InputStreamReader(
                    inputStream, "UTF-8"));
                String word;
                while ((word = inputFile.readLine()) != null) {
                    word = word.trim();
                    list.add(word);
                }






    }

    @Override
    public List<String> getData() {
        return  list;
    }
}
