import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;


public class CustomFileWriterTest {

    @Test
    public void testCanwriteToFile() throws IOException {
        String fileLoca = "/home/scripted/Documents/NewJavaWorks/path/src";
        String filename = "user.json";
        Path file = Path.of(fileLoca,filename);
        String json = """
                {
                "name": "Zeus",
                "age": 100000000,
                "country": "USA","
                }
                """;
        CustomFileWriter.writeJsonToFile(file, json);
        String dataFromFile = Files.readString(file);
        assertEquals(json, dataFromFile);

    }
    @Test
    public void testCanwriteToFileWithNewLine() throws IOException {
        String fileLocat = "/home/scripted/Documents/NewJavaWorks/path/src";
        String filenames = "user.yaml";
        Path pile = Path.of(fileLocat,filenames);
        String yaml = """
                name: Zeus
                        age: 100000000
                        country: USA
        """;
        CustomFileWriter.writeYamlToFile(pile, yaml);
        String dataFromFile = Files.readString(pile);
        assertEquals(yaml, dataFromFile);
    }

    @Test
    public void testCanReadFromFile() throws IOException {
        String fileLocat = "/home/scripted/Documents/NewJavaWorks/path/src";
        String filenames = "user.yaml";
        Path pile = Path.of(fileLocat,filenames);
        String yaml = """
                name: Zeus
                        age: 100000000
                        country: USA
        """;
        CustomFileWriter.readYamlFromFile(pile, yaml);
        String readFromFile = Files.readString(pile);
        assertEquals(yaml, readFromFile);

    }

}