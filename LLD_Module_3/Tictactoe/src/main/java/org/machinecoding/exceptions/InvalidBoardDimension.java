package org.machinecoding.exceptions;

public class InvalidBoardDimension extends Exception {
    public InvalidBoardDimension(){

    }
    public InvalidBoardDimension(String message) {
        super(message);
    }
}
