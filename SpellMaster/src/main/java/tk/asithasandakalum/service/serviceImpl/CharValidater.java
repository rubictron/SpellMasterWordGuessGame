package tk.asithasandakalum.service.serviceImpl;

import tk.asithasandakalum.service.Validater;

import java.util.regex.Pattern;

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
public class CharValidater implements Validater<String> {

    public boolean validate(String character) {
        return Pattern.compile("^[A-Za-z]$").matcher(character).matches();
    }
}