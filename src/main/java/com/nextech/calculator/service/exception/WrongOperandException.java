package com.nextech.calculator.service.exception;

public class WrongOperandException extends Exception {

    public WrongOperandException(String message) {
        super(message);
    }

    public WrongOperandException(String message, Throwable cause) {
        super(message, cause);
    }
}
