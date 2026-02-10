import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomFileWriter {

    public static void writeJsonToFile(Path file, String json) throws IOException {
        Files.writeString(file, json, StandardCharsets.UTF_8);
    }
}
