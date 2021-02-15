package com.nextech.calculator.service.strategy;

import com.nextech.calculator.service.exception.WrongOperandException;

public class ConcreteStrategyDivide implements Strategy {
    @Override
    public long doOperation(long num1, long num2) throws WrongOperandException {
        if(num2 == 0) {
            throw new WrongOperandException("Second operand cannot be 0(zero).");
        }

        return num1 / num2;
    }
}
