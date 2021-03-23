package org.example.firsttaste.slides.mocking;

import java.util.Scanner;

public class ScannerWrapper {

    private Scanner scanner = new Scanner(System.in);

    public String nextLine(){
        return scanner.nextLine();
    }


}
