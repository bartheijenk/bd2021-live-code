package org.example.firsttaste.slides.h10;

public class Character implements Moveable {

    protected int position;

    @Override
    public String toString() {
        return ">".repeat(position);
    }

    public void move(int pos) {
        this.position += pos;
    }

}
