package org.example.firsttaste.slides.h3;

public class Person {

    String name; // STATE
    int age;

    // methodes  // BEHAVIOUR

    // ...

    public boolean equals(Object o) {
        if (this.age == ((Person) o).age){
            return true;
        } else {
            return false;
        }
    }

}
