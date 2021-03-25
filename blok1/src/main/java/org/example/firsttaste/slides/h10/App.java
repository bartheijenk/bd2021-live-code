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
        List<Renderable> characters = List.of(new Animal("Bobby"), new Cop("Harry", 200), new Robot("C3PO"), new Animal("Cat"), new Plane("747"), new Tank("LEO"));

        int frame = 0;
        while (frame < 10) {
            System.out.println();
            for (Renderable character : characters) {
                character.move(new Random().nextInt(10));
                System.out.println(character.showMe());
            }
            Thread.sleep(500);

            // newFeature(characters);

            frame++;
        }

    }

    private void newFeature(List<Renderable> characters) {
        for (Renderable character : characters) {
            if (character instanceof Enemy) {
                Enemy e = (Enemy) character;
                e.eat();
            }
        }
    }

}
