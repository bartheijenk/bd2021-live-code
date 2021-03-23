package org.example.firsttaste.slides.mocking;

import static java.time.Instant.now;
import static java.time.temporal.ChronoUnit.DAYS;

public class CoronaTestAanvrager {

    private ScannerWrapper scanner = new ScannerWrapper();
    private SoutWrapper sout = new SoutWrapper();

    public void start() {
        sout.print("Wat is uw BSN? ");
        String input = scanner.nextLine();
        sout.println(showBSN(input));
        sout.println("Uw test is gepland op: " + now().plus(1, DAYS));
    }

    String showBSN(String input) {
        return "Uw BSN is: " + input;
    }

    public ScannerWrapper getScanner() {
        return scanner;
    }

    public void setScanner(ScannerWrapper scanner) {
        this.scanner = scanner;
    }

    public void setSout(SoutWrapper sout) {
        this.sout = sout;
    }
}
