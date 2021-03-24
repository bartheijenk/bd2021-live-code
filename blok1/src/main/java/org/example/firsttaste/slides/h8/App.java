package org.example.firsttaste.slides.h8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) {
        new App().start();
    }

    private void start() {
        Iban vanBram = Iban.of("NL89", "RABO0", "315044462");
        System.out.println(vanBram);

        String name1 = Iban.class.getName();
        String name = vanBram.getClass().getName();
        System.out.println(name1);
        System.out.println(name);

        Field[] fields = vanBram.getClass().getFields();
        for (Field field : fields) {
            System.out.print(field.getType());
            System.out.println(field.getName());
        }

        for (Method declaredMethod : vanBram.getClass().getDeclaredMethods()) {
            System.out.println(declaredMethod);
            if (declaredMethod.isAnnotationPresent(Override.class)) { // wil not work: Override is not retained in runtime
                System.out.printf("%s is overriden! %n", declaredMethod.getName());
            }
        }
    }
}
