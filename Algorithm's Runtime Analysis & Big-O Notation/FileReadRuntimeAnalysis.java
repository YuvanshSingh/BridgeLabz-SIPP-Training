// 4. Large File Reading Efficiency: FileReader vs InputStreamReader
import java.io.*;

public class FileReadRuntimeAnalysis {
    public static void compareFileReaders(String filename, String charset) throws IOException {
        long start = System.nanoTime();
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        }
        long fileReaderTime = System.nanoTime() - start;
        start = System.nanoTime();
        wordCount = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), charset))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        }
        long inputStreamReaderTime = System.nanoTime() - start;
        System.out.println("FileReader time: " + fileReaderTime + " ns");
        System.out.println("InputStreamReader time: " + inputStreamReaderTime + " ns");
    }
}
