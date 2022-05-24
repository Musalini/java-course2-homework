package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет я размышлял над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне извстно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";
        String s = "Hello!";
        try (FileWriter writer = new FileWriter("Text2", true)) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
//            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
