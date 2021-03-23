package org.example.firsttaste.slides.mocking;

import static java.time.Instant.now;
import static java.time.temporal.ChronoUnit.DAYS;

public class CoronaTestAanvrager {

    private ScannerWrapper scanner = new ScannerWrapper();

    public void run() {
        System.out.print("Wat is uw BSN? ");
        String input = scanner.nextLine();
        System.out.println("Uw BSN is: " + input);
        System.out.print("Uw test is gepland op: " + now().plus(1, DAYS));
    }

    public ScannerWrapper getScanner() {
        return scanner;
    }

    public void setScanner(ScannerWrapper scanner) {
        this.scanner = scanner;
    }
}
