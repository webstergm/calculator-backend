package com.nextech.calculator.service.strategy;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public long doOperation(long num1, long num2) {
        return num1 + num2;
    }
}
