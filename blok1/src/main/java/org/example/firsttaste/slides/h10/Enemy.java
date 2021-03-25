package org.example.firsttaste.slides.h10;

public interface Enemy {

    // abstract method
    void attack();

    default void eat() {
        throw new UnsupportedOperationException("Not implemented!");
    }

}
