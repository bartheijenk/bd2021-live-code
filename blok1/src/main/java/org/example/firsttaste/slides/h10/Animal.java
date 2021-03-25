package org.example.firsttaste.slides.h10;

public class Animal extends Character {

    public Animal(String n) {
        super(n);
    }

    @Override
    public String toString() {
        return "Animal    " + super.toString();
    }

    @Override String showMe() {
        return toString();
    }
}
