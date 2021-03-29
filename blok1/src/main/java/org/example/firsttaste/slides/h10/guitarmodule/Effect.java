package org.example.firsttaste.slides.h10.guitarmodule;

public interface Effect {
    // closed for modification
    void process(StringBuilder sound);


    // open for extension through implements and register on roland
}
