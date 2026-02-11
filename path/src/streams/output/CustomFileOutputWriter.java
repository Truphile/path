package streams.output;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CustomFileOutputWriter {
    public static void main(String[] args) throws FileNotFoundException {
        String json = """
            {
            "name": "John Dan",
            "phone_number": "123456789",
            
            }
            """;
        String filePath = "/home/scripted/Documents/NewJavaWorks/path/src/user.json";
        try (FileOutputStream fileOutputStreamput = new FileOutputStream(filePath, true);) {
            fileOutputStreamput.write(json.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
        }
    }

