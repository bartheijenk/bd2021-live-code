package org.example.firsttaste.slides.h10;

public class Animal extends Character {

    public Animal(String n) {
        super(n);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3A" + super.toString();
    }

}
