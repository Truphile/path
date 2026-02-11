package streams.input;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public class cloudDataReader {

    public static String readDataFrom(String cloudLocation) {
        URI uri = URI.create(cloudLocation);
        try (InputStream inputStream = uri.toURL().openStream()) {

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
