package com.nextech.calculator.service.strategy;

import com.nextech.calculator.service.exception.WrongOperandException;

public interface Strategy {
    long doOperation(long num1, long num2) throws WrongOperandException;
}
