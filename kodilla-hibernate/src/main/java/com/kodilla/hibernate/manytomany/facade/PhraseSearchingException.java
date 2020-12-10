package com.kodilla.hibernate.manytomany.facade;

public class PhraseSearchingException extends Exception {

    public static String ERR_NOT_FOUND = "Phrase not found";

    public PhraseSearchingException(String message){
        super(message);
    }

}
