package work_with_files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("Text2")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\nDone!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
