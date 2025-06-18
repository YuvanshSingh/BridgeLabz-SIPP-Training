import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        if (numStudents <= 0) {
            System.out.println("Please enter a positive number of students.");
            scanner.close();
            return;
        }
        
        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            do {
                System.out.print("Enter Physics marks (0-100): ");
                marks[i][0] = scanner.nextDouble();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Please enter marks between 0 and 100.");
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);
            
            do {
                System.out.print("Enter Chemistry marks (0-100): ");
                marks[i][1] = scanner.nextDouble();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Please enter marks between 0 and 100.");
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);
            
            do {
                System.out.print("Enter Mathematics marks (0-100): ");
                marks[i][2] = scanner.nextDouble();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Please enter marks between 0 and 100.");
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);
            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        
        System.out.println("\nStudent Results:");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-8s %-10s %-10s %-10s %-12s %s%n", 
                         "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-8d %-10.2f %-10.2f %-10.2f %-12.2f %c%n",
                            (i + 1),
                            marks[i][0],
                            marks[i][1],
                            marks[i][2],
                            percentages[i],
                            grades[i]);
        }
        
        scanner.close();
    }
}
