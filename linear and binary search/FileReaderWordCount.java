// FileReader Problem 2: Count Occurrence of a Word in a File
import java.io.*;

public class FileReaderWordCount {
    public static int countWord(String filename, String word) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String w : line.split("\\s+")) {
                    if (w.equals(word)) count++;
                }
            }
        }
        return count;
    }
}
