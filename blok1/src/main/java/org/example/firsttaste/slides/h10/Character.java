package org.example.firsttaste.slides.h10;

public abstract class Character implements Renderable {

    protected int position;
    private String name;

    public Character(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return path(position, name);
    }

    public void move(int pos) { // HOE moet ie het doen?
        this.position += pos;
    }

    @Override
    public String showMe() {
        return toString();
    }

}
