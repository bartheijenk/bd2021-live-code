package org.example.firsttaste.slides.h10;

public class Cop extends Character implements Enemy, Comparable<Cop> {

    private int ammo = 0;

    public Cop(String name, int ammo) { // altijd aanwezig indien zlef geen ctor aangemaakt
        super(name); // call Character ctor
        this.ammo = ammo;
    }

    @Override
    public String toString() {
        return "Cop       " + super.toString();
    }

    @Override String showMe() {
        return toString();
    }

    @Override public int compareTo(Cop o) {
        return 0;
    }

    @Override public void attack() {

    }
}
