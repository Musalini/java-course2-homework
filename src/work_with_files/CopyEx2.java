package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("/home/musa/Рабочий стол/Java-Transparent-Images.png");
             FileOutputStream outputStream = new FileOutputStream("TJava-Transparent-Images.png")) {

            int i;
            while ((i= inputStream.read()) != -1){
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
