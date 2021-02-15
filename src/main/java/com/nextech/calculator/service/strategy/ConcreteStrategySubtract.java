package com.nextech.calculator.service.strategy;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public long doOperation(long num1, long num2) {
        return num1 - num2;
    }
}
