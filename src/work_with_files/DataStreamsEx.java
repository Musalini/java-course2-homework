package work_with_files;

import java.io.*;

public class DataStreamsEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))) {

            outputStream.writeBoolean(true);
            outputStream.writeInt(12);
            outputStream.writeByte(1);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readByte());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
