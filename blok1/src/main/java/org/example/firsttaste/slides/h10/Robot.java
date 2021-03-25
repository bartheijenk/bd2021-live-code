package org.example.firsttaste.slides.h10;

public class Robot extends Character {

    public Robot(String n) {
        super(n);
    }

    @Override
    public String toString() {
        return "Robot     " + super.toString();
    }

    @Override String showMe() {
        return toString();
    }
}
