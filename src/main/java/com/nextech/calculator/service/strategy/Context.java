package com.nextech.calculator.service.strategy;

import com.nextech.calculator.model.ResponseModel;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public ResponseModel executeOperation(long num1, long num2) {
        ResponseModel responseModel = new ResponseModel();
        try {
            responseModel.setResult(strategy. doOperation(num1, num2));
            responseModel.setError(false);
            responseModel.setMessage("Operation successful");
        } catch (Exception e) {
            responseModel.setError(true);
            responseModel.setMessage("Operation failed. Error cause: " + e.getMessage());
        }

        return responseModel;
    }
}
