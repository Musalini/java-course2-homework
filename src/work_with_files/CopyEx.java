package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/musa/Рабочий стол/Java-Transparent-Images.png"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("TJava-Transparent-Images.png"))) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
