package Day4_Methods.Level2;

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
            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + (canVote ? " can vote" : " cannot vote"));
        }

        scanner.close();
    }
}
