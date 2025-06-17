package Level1;

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();

        String youngest = "";
        int minAge = ageAmar;
        youngest = "Amar";

        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }

        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }

        String tallest = "";
        double maxHeight = heightAmar;
        tallest = "Amar";

        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }

        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }
        System.out.println("The youngest friend is " + youngest + " with age " + minAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight + " cm.");
    }
}
