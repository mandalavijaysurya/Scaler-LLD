package org.machinecoding.exceptions;

public class InvalidBotCountException extends Exception{
    public InvalidBotCountException(){

    }

    public InvalidBotCountException(String message){
        super(message);
    }
}
