package com.example.mail_dien_tu.model.bean;

public class Information {
    private String language;
    private String size;
    private String fillter;
    private String signature;

    public Information() {
    }

    public Information(String language, String size, String fillter, String signature) {
        this.language = language;
        this.size = size;
        this.fillter = fillter;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFillter() {
        return fillter;
    }

    public void setFillter(String fillter) {
        this.fillter = fillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
