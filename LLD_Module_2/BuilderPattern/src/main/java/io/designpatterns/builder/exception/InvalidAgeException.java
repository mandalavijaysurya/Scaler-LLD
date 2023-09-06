package io.designpatterns.builder.exception;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(){
        super("Under age");
    }
}
