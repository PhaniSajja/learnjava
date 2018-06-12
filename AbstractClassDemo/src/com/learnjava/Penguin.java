package com.learnjava;

public class Penguin  extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("hey, I'm " + getName() + ". not good at flying instead can I swim? ");
    }
}
