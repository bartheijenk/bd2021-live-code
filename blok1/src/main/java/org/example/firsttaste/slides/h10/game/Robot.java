package org.example.firsttaste.slides.h10.game;

import org.example.firsttaste.slides.h3.Person;

public class Robot extends Character implements Comparable<Person> {

    public Robot(String n) {
        super(n);
    }

    @Override
    public String getIcon() {
        return "\uD83E\uDD16";
    }

    @Override public int compareTo(Person o) {
        return 0;
    }
}
