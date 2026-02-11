package streams.input;

import java.io.DataInputStream;

public class CustomDataInputReader {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        try (DataInputStream dataInputStream = new DataInputStream(System.in);) {
            byte[] data = dataInputStream.readNBytes(12);
            System.out.println("Your name is: " + new String(data));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
