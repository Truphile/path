package streams.input;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public class cloudDataReader {

    public static void main(String[] args) {
        final String file = "/home/scripted/Documents/NewJavaWorks/path/src/streams/output/post.json";
        String url = "https://dummyjson.com/products";
        String data = readDataFrom(url);

        try (FileWriter writer = new FileWriter(file);) {
            writer.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static String readDataFrom(String cloudLocation) {
        URI uri = URI.create(cloudLocation);
        try (InputStream inputStream = uri.toURL().openStream()) {
            byte[] data = inputStream.readAllBytes();
            return new String(data);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

}