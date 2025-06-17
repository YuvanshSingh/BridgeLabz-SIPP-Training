import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + " (in cm): ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        
        double mean = sum / heights.length;
        System.out.printf("Mean height of the football team: %.2f cm", mean);
        scanner.close();
    }
}
