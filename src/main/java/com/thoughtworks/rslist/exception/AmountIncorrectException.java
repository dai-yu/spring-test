package com.thoughtworks.rslist.exception;

public class AmountIncorrectException  extends RuntimeException{
    private String message;

    public AmountIncorrectException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
