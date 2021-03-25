package org.example.firsttaste.slides.h10.thirdparty;

import org.example.firsttaste.slides.h10.Moveable;

public class Plane implements Moveable {

    private int pos;

    @Override
    public void move(int i) {
        this.pos += i;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "pos=" + pos +
                '}';
    }
}
