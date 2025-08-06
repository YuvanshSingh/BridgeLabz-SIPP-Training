// InputStreamReader Problem 1: Convert Byte Stream to Character Stream
import java.io.*;

public class InputStreamReaderByteToChar {
    public static void readBinaryFile(String filename, String charset) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), charset))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
