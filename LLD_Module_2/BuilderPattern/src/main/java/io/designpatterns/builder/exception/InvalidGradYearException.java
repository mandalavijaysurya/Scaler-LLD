package io.designpatterns.builder.exception;

public class InvalidGradYearException extends RuntimeException {

    public InvalidGradYearException(){
        super("Year is beyond 2023");
    }
}
