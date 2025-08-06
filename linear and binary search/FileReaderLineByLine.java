// FileReader Problem 1: Read a File Line by Line
import java.io.*;

public class FileReaderLineByLine {
    public static void readFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
