package streams.input;

import java.io.FileInputStream;
import java.io.IOException;

public class CustomDataInputReader {
    public static void main(String[] args)  {
        String path = "/home/scripted/Documents/NewJavaWorks/path/src/user.json";
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            byte[] data = fileInputStream.readAllBytes();
            System.out.println(new String(data));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
