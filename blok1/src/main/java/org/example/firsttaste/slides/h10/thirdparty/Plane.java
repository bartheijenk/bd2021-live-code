package org.example.firsttaste.slides.h10.thirdparty;

import org.example.firsttaste.slides.h10.Renderable;

public class Plane implements Renderable {

    private int pos;
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void move(int i) {
        this.pos += i;
    }

    @Override
    public String showMe() {
        return "✈" + path(pos, name);
    }

}
