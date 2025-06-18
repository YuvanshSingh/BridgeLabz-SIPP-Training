import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive number of persons.");
            scanner.close();
            return;
        }
        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            } while (personData[i][1] <= 0);
            
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nBMI Results:");
        System.out.println("--------------------------------------------");
        System.out.printf("%-8s %-10s %-10s %-10s %s%n", 
                         "Person", "Weight", "Height", "BMI", "Status");
        System.out.println("--------------------------------------------");
        
        for (int i = 0; i < number; i++) {
            System.out.printf("%-8d %-10.2f %-10.2f %-10.2f %s%n",
                            (i + 1),
                            personData[i][0],
                            personData[i][1],
                            personData[i][2],
                            weightStatus[i]);
        }
        
        scanner.close();
    }
}
