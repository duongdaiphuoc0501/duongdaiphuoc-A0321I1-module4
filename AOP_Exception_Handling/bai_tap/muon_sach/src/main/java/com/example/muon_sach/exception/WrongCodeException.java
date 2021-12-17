package com.example.muon_sach.exception;

public class WrongCodeException extends Exception {
    @Override
    public String getMessage() {
        return "Your code is invalid";
    }
}
