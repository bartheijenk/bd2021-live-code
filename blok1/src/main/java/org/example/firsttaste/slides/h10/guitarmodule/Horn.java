package org.example.firsttaste.slides.h10.guitarmodule;

public class Horn implements Effect {
    @Override
    public void process(StringBuilder sound) {
        sound.append("TOET!");
    }
}
