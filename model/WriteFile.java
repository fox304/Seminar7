package Seminar7.model;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile implements WriteIntoFile {
    public void writeF(String text) {

        try (FileWriter writer = new FileWriter("notes3.txt", true)) {

            writer.write(text);

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

