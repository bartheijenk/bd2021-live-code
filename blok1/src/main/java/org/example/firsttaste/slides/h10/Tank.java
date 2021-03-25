package org.example.firsttaste.slides.h10;

public class Tank implements Enemy, Renderable {

    private final String name;
    private int pos;

    public Tank(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Pats boem!");
    }

    @Override
    public void move(int i) {
        pos += i;
    }

    @Override
    public String showMe() {
        return "\uD83D\uDE97" + path(pos, name);
    }
}
