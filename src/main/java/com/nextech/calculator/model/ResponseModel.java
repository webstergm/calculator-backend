package com.nextech.calculator.model;

public class ResponseModel {

    private Boolean isError;
    private Long result;
    private String message;

    public ResponseModel(Boolean isError, Long result, String message) {
        this.isError = isError;
        this.result = result;
        this.message = message;
    }

    public ResponseModel() {
    }

    public Boolean getError() {
        return isError;
    }

    public void setError(Boolean error) {
        isError = error;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
