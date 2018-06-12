package com.learnjava;

public class Main {

    public static void main(String[] args) {
    Animal doggie = new Dog("Snoopy");
    doggie.breathe();
    doggie.eat();

    Animal penguin = new Penguin("Penquin");
    penguin.eat();
    penguin.breathe();
    ((Penguin) penguin).fly();

    Animal parrot = new Parrot("Parrot");
    parrot.eat();
    parrot.breathe();
    ((Parrot) parrot).fly();

    }
}
