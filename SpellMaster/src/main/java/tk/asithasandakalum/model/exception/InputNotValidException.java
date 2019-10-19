package tk.asithasandakalum.model.exception;

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
public class InputNotValidException extends RuntimeException {
    public InputNotValidException(String message) {
        super(message);
    }
}