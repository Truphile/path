import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExampleNIO {

    /**
     * 1. Create a path that points to the location on the computer OS
     * 2. Use a method of class Files to operate on the path
     */
    public static void main(String[] args) {
        String fileLocation = "/home/scripted/IdeaProjects";
        Path path = Path.of(fileLocation);
        System.out.println(path.getFileSystem());

        String fileLoca = "/home/scripted/Documents/NewJavaWorks/path/src";
        String filename = "user.json";
        Path pile = Path.of(fileLoca,filename);
        try {
            Files.createFile(pile);
        }catch (IOException e) {
            e.printStackTrace();
        }


        String fileLocat = "/home/scripted/Documents/NewJavaWorks/path/src";
        String filenames = "user.yaml";
        Path file = Path.of(fileLocat,filenames);
        try {
            Files.createFile(file);
        }catch (IOException e){
            e.printStackTrace();

        }

    }
}



