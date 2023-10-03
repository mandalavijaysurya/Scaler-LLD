package org.machinecoding.exceptions;

import org.machinecoding.models.Move;

public class GameOverException extends Exception {

    public GameOverException(){

    }
    public GameOverException(String message) {
        super(message);
    }
}
