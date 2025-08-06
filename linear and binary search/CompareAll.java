// Challenge Problem: Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
import java.io.*;

public class CompareAll {
    public static void compareStringConcat() {
        int n = 1000000;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = "hello";
        long start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (String s : arr) sbuf.append(s);
        long bufferTime = System.nanoTime() - start;
        start = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (String s : arr) sbuilder.append(s);
        long builderTime = System.nanoTime() - start;
        System.out.println("StringBuffer time: " + bufferTime + " ns");
        System.out.println("StringBuilder time: " + builderTime + " ns");
    }
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
