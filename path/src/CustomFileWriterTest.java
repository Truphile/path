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

}