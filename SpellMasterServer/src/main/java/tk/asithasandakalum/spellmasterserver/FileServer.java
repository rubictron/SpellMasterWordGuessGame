package tk.asithasandakalum.spellmasterserver;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.ch.IOUtil;
import tk.asithasandakalum.repository.DataSource;
import tk.asithasandakalum.repository.TextDataSource;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by Asitha Sandakalum on 9/14/2019
 -----------------------------------------------------------------------*/
@Service
public class FileServer implements Server{
    private String filePath;

    @Autowired
    public FileServer() {

    }

    @Override
    public void start(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String getData() throws IOException {
        InputStream is = new FileInputStream(filePath);

        DataSource dataSource = new TextDataSource(is);
        JSONArray array = new JSONArray(dataSource.getData());
        return array.toString();
    }

    @Override
    public void uploadFile(InputStream inputStream) throws IOException {

        OutputStream outputStream = new FileOutputStream(filePath);

        IOUtils.copy(inputStream,outputStream);
    }
}
