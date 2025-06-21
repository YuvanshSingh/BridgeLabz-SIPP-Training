import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess, feedback = 0;
        while (feedback != 3) {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (1: low, 2: high, 3: correct)");
            feedback = sc.nextInt();
            if (feedback == 1) low = guess + 1;
            else if (feedback == 2) high = guess - 1;
        }
        System.out.println("Guessed correctly!");
    }
    static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }
}
