// InputStreamReader Problem 2: Read User Input and Write to File
import java.io.*;

public class InputStreamReaderUserInput {
    public static void readAndWrite(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            String line;
            while (!(line = br.readLine()).equals("exit")) {
                bw.write(line);
                bw.newLine();
            }
        }
    }
}
