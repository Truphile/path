import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        String fileLocation = "/home/scripted/IdeaProjects";
        Path path = Path.of(fileLocation);

        System.out.println(path.getFileSystem());
    }
}

