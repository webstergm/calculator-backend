package com.nextech.calculator.beans;

import com.nextech.calculator.service.CalculatorService;
import com.nextech.calculator.service.CalculatorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContextServices {

    @Bean(name="calculatorService")
    public CalculatorService calculatorService() {
        return new CalculatorServiceImpl();
    }

}
