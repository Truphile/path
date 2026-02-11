package streams.output;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VargsExample {

    public static void main(String[] args) {
        try {
            String fileLocation = "/home/scripted/Documents/NewJavaWorks/path/src/streams/output/post.json";
            Path path = Paths.get(fileLocation);
            Files.deleteIfExists(path);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
