package com.openclassrooms.helloworld.model;

public class HelloWorld {
    public String sValue = "Hello World!";

    public String getValue() {
        return sValue;
    }

    public void setValue(String sValue) {
        this.sValue = sValue;
    }
    @Override
    public String toString() { return sValue; }
}
