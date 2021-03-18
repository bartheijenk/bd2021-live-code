package org.example.firsttaste.slides.h4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class TryWithResources {

    static final String DATA_TXT = "data.txt";

    public void processFileOldStyle() {
        BufferedReader streamOfText = createReader(DATA_TXT);

        try {
            process(streamOfText);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                streamOfText.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void processFileNewStyle() {
        try (BufferedReader streamOfText = createReader(DATA_TXT)) {
            process(streamOfText);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    private BufferedReader createReader(String resourceFileName) {
        return new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(resourceFileName)));
    }

    private void process(BufferedReader streamOfText) throws IOException {
        StringJoiner total = new StringJoiner(" | ");

        String line = streamOfText.readLine();
        while (line != null) {
            total.add(line);
            line = streamOfText.readLine();
        }

        System.out.println(total.toString());
    }

    public void readMyResource() {
        try (MyResource mr = new MyResource()) {
            String read = mr.read();
            System.out.println("Read says: " + read);
        }
    }

    public static void main(String[] args) {
        TryWithResources twr = new TryWithResources();

        twr.processFileOldStyle();
        twr.processFileNewStyle();
        twr.readMyResource();
    }
}
