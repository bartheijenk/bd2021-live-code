package org.example.firsttaste.slides.h6;

import org.example.firsttaste.slides.h3.Person;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] getallen = {0, 1, 2, 3, 4, 6};

        getallen = new int[10]; // index van 0 tot en met 9

        getallen[0] = 1;
        getallen[4] = 56;

        int i = getallen[1];
        int j = getallen[4];
        System.out.println(i);
        System.out.println(j);

        int length = getallen.length;

        for (int counter = 0; counter < getallen.length; counter++) {
            int item = getallen[counter];
            System.out.println(item);
        }

        for (int item : getallen) {
            System.out.println(item);
        }

        Person[] personen = new Person[40];
        personen[9] = new Person();
        // personen[19] = 45;  // NOK

        Person person = personen[1];
        System.out.println(person);

        int[][] table = {
                {0, 2, 3},
                {8, 2, 5},
                {8, 2, 5},
                {2, 8, 5}
        };

        table[0][2] = 1000;
        table[1] = new int[]{18, 12, 15};

        System.out.println(table.length * table[2].length);

        System.out.println(table);
        System.out.println(table[0]);
        System.out.println(table[0][2]);

    }

}
