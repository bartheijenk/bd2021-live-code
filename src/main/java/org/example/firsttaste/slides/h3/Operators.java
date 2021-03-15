package org.example.firsttaste.slides.h3;

public class Operators {

    public void demo() {

        Person bram = new Person();

        byte b = 0b0000_1111; // numerical literals
        byte invertedB = (byte) ~b; // 1101_0000

        int and = b & invertedB;

        boolean thisIsTrue = true;
        boolean whatsThis = !thisIsTrue;

        //                       0000_0000_0000_0000_0000_0000_0000_1111
        int result = b >> 3;  // 0000_0000_0000_0000_0000_0000_0000_0001
        int result2 = b << 3; // 0000_0000_0000_0000_0000_0000_0111_1000

        if (bram instanceof Person) {
            System.out.println("Het is een persoon!");
        }

        // String message = ""; // ass. statement.
        // if (result >= 0) {   // if else statement
        //     message = "POS";
        // } else {
        //     message = "NEG";
        // }

        int som = 1 + 2; // statement; doet iets en afgeloten met een ;
        // 1 + 2            expression: leidt tot een waarde, moet nog uitgerekend/geëvalueerd worden.
        String message = (result >= 0) ? "POS" : "NEG"; // assignment statement

        System.out.println(message);

        som = som + 3;
        som += 3; // hetzelfde.

        som = som + 1;
        System.out.println(som);

        int waardeVanSomVoordatHijOpgehoogdWordt = som++;
        // statement expression
        // - statement: hoog som op
        // - expression: het heeft een waarde (zoals 13+21)

        int waardeVanSomNadatHijOpgehoogdIs = ++som;

        int age = 18;
        age = age + 1;
        age += 1;
        age++;
        ++age;

        int incrementedAge = age++;

        System.out.println(age);
        System.out.println(incrementedAge);

        //                       0000_0000_0000_0000_0000_0010_0000_0000
        int wordtEenByte = 256;

        //                                                     0000_0000
        byte bt = (byte) wordtEenByte;

        System.out.println(bt);

        Compass windrichting = Compass.E;

        naarNL(windrichting);

    }

    public void naarNL(Compass c) {
        if (c.equals(Compass.N)) {
            System.out.println("Noord");
        } else if (c.equals(Compass.E)) {
            System.out.println("Oost");
        } else if (c.equals(Compass.S)) {
            System.out.println("Zuid");
        } else if (c.equals(Compass.W)) {
            System.out.println("West");
        }

        switch (c) {
            case E:
                System.out.println("Oost2"); break;
            case N:
                System.out.println("Noord2"); break;
            default:
                System.out.println("Witnie");
        }

    }

    public static void main(String[] args) {
        new Operators().demo();
    }

}
