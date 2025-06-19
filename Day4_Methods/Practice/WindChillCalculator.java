package Day4_Methods.Practice;

import java.util.Scanner;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) 
               + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = scanner.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        double speed = scanner.nextDouble();

        double windChill = calculateWindChill(temp, speed);
        System.out.printf("Wind chill temperature: %.2f°F%n", windChill);
        scanner.close();
    }
}
