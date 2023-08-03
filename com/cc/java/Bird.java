package com.cc.java;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {
        return "I can fly at 50mph!";
    }

    @Override
    public String hasFeathers() {
        return "I have x feathers!";
    }

}
