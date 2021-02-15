package com.nextech.calculator.service;

import com.nextech.calculator.model.ResponseModel;
import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    ResponseModel doOperation(String operation, Long num1, Long num2);
}
