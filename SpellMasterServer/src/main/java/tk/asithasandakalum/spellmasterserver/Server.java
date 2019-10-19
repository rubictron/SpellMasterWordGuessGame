package tk.asithasandakalum.spellmasterserver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

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
public interface Server {
    void start(String filePath);
    String getData() throws IOException;
    void uploadFile(InputStream inputStream) throws IOException;
}
