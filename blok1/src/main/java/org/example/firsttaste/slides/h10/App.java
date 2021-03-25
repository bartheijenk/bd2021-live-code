package org.example.firsttaste.slides.h10;

import org.example.firsttaste.slides.h10.thirdparty.Plane;

import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Character c = new Animal("X");
        System.out.println(c.toString()); // most specific impl. is used; dynamic binding
        c = new Robot("Y");
        System.out.println(c.toString()); // most specific impl. is used; dynamic binding

        while (true) {
            new App().start();
        }
    }

    private void start() throws InterruptedException {
        List<Moveable> characters = List.of(new Animal("Bobby"), new Cop("Harry", 200), new Robot("C3PO"), new Animal("Cat"), new Plane(), new Tank());

        int frame = 0;
        while (frame < 10) {
            for (Moveable character : characters) {
                character.move(new Random().nextInt(10));
                System.out.println(character);
            }
            Thread.sleep(500);

            // newFeature(characters);

            frame++;
        }

    }

    private void newFeature(List<Moveable> characters) {
        for (Moveable character : characters) {
            if (character instanceof Enemy) {
                Enemy e = (Enemy) character;
                e.eat();
            }
        }
    }

}
