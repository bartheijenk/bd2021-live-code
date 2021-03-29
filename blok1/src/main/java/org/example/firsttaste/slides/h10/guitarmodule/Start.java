package org.example.firsttaste.slides.h10.guitarmodule;

public class Start {

    public static void main(String[] args) {
        Roland td13 = new Roland();

        td13.register(new Distortion());
        td13.register(new Delay());
        td13.register(new Reverb());
        td13.register(new Delay());
        td13.register(new Distortion());
        td13.register(new Horn());
        td13.register(new Phaser());

        td13.start("Vader Jacob");
    }
}
