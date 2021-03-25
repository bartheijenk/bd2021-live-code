package org.example.firsttaste.slides.h10;

public abstract class Character implements Moveable {

    protected int position;
    private String name;

    public Character(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return name + ">".repeat(position);
    }

    public void move(int pos) { // HOE moet ie het doen?
        this.position += pos;
    }

    abstract String showMe();

}
