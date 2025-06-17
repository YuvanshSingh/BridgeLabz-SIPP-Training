package Day1_Problems;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Amar's details:");
        System.out.print("Age: ");
        int amarAge = input.nextInt();
        System.out.print("Height (cm): ");
        double amarHeight = input.nextDouble();
        
        System.out.println("Enter Akbar's details:");
        System.out.print("Age: ");
        int akbarAge = input.nextInt();
        System.out.print("Height (cm): ");
        double akbarHeight = input.nextDouble();
        
        System.out.println("Enter Anthony's details:");
        System.out.print("Age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Height (cm): ");
        double anthonyHeight = input.nextDouble();
        
        // Find youngest
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }
        
        // Find tallest
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
        
        input.close();
    }
}
