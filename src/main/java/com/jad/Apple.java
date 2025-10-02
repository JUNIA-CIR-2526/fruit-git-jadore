package com.jad;

public class Apple {
    public String getName(){
        return this.name;
    }

    private final String name;

    public Apple(final String name){
        this.name=name;
    }
}
