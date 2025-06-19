package Day4_Methods.Practice;

import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.println("Student " + (i + 1) + 
                             (canStudentVote(ages[i]) ? " can vote" : " cannot vote"));
        }
        scanner.close();
    }
}
