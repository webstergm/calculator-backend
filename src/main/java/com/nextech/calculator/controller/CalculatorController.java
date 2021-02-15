package com.nextech.calculator.controller;

import com.nextech.calculator.model.ResponseModel;
import com.nextech.calculator.service.CalculatorService;
import com.nextech.calculator.service.CalculatorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/api/calculator")
public class CalculatorController {

    @Resource(name="calculatorService")
    CalculatorService calculatorService;

    @GetMapping(value="/{op}/{num1}/{num2}")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseModel doOperation(@PathVariable String op,
                                     @PathVariable long num1,
                                     @PathVariable long num2) {
        ResponseModel responseModel = calculatorService.doOperation(op, num1, num2);

        return responseModel;
    }

}
