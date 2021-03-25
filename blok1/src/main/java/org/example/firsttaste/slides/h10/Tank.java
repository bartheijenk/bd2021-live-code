package org.example.firsttaste.slides.h10;

public class Tank implements Enemy, Moveable {
    @Override
    public void attack() {
        System.out.println("Pats boem!");
    }

    @Override public void move(int i) {

    }
}
