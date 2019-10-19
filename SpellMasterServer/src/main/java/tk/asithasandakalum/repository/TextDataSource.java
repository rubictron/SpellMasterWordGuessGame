package tk.asithasandakalum.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

    public TextDataSource(InputStream inputStream) {


            try (BufferedReader inputFile = new BufferedReader(new InputStreamReader(
                    inputStream, "UTF-8"))) {
                String word;
                while ((word = inputFile.readLine()) != null) {
                    word = word.trim();
                    list.add(word);
                }
            } catch (IOException ioe) {
                System.out.println("Something went wrong! : " + ioe.getMessage());
            }
            System.out.println("Successfully read the file ");

    }

    @Override
    public List<String> getData() {
        return  list;
    }
}
