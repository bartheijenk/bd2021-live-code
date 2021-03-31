package org.example.firsttaste.slides.h13;

import org.example.firsttaste.slides.h3.Person;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    // Generic Types

    public static void main(String[] args) {
        new Generics().start();

    }

    private void start() {
        List<Person> lijst = new ArrayList<>();
        // lijst.add("");
        // lijst.add(1);
        lijst.add(new Person("Jay"));

        print(lijst);

        Object[] objects = new Object[10];
        Object object = objects[8];
        int length = objects.length;
    }

    private void printPersonen(List lijst) {
        for (Object o : lijst) {
            if (o instanceof Person) {
                Person p = (Person) o;
                System.out.println(p.getName());
            }
        }
    }

    private void print(List<Person> lijst) {
        Person p = lijst.get(0);
        System.out.println(p.getName());
    }

}
