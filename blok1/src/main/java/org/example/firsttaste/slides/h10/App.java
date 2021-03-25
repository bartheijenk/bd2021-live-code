package org.example.firsttaste.slides.h10;

import org.example.firsttaste.slides.h10.thirdparty.Plane;

import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) throws InterruptedException {
        while(true) {
            new App().start();
        }
    }

    private void start() throws InterruptedException {
        List<Moveable> characters = List.of(new Animal(), new Cop(), new Robot(), new Animal(), new Plane());

        int frame = 0;
        while (frame < 10) {
            for (Moveable character : characters) {
                character.move(new Random().nextInt(10));
                System.out.println(character);
            }
            Thread.sleep(500);
            frame++;
        }

    }

}
