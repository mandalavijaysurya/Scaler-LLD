package org.machinecoding.exceptions;

public class InvalidPlayerCount extends Exception {
    public InvalidPlayerCount(){

    }

    public InvalidPlayerCount(String message){
        super(message);
    }
}
