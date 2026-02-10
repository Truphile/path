import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomFileWriter {

    public static void writeJsonToFile(Path file, String json) throws IOException {
        Files.writeString(file, json);
    }

    public static void writeYamlToFile(Path pile, String yaml) throws IOException {
        Files.writeString(pile,yaml);
    }

    public static void readYamlFromFile(Path pile, String yaml) throws IOException {
        Files.readString(pile);
        System.out.println(pile.toString());
    }
}
