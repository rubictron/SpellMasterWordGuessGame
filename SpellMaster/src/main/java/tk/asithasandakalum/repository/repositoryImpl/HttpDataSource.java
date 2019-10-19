package tk.asithasandakalum.repository.repositoryImpl;

import org.json.JSONArray;
import tk.asithasandakalum.repository.DataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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
public class HttpDataSource implements DataSource {

    private ArrayList<String> list = new ArrayList<>();

    public HttpDataSource(String url) throws IOException {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));



        JSONArray array = new JSONArray(in.readLine());

        for (Object a:array) {
            list.add((String) a);
        }

        in.close();

    }

    @Override
    public List<String> getData() {
        return list;
    }
}
