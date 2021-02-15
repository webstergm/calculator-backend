package com.nextech.calculator.service;

import com.nextech.calculator.model.ResponseModel;
import com.nextech.calculator.service.strategy.*;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public ResponseModel doOperation(String operation, Long num1, Long num2) {
        Context context = new Context();
        switch (operation) {
            case "add":
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case "subtract":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "multiply":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            case "divide":
                context.setStrategy(new ConcreteStrategyDivide());
                break;
            default:
                //throws unsupported op exception
                break;
        }

        return context.executeOperation(num1, num2);
    }
}
