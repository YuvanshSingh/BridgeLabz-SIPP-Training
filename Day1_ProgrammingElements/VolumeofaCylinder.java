import java.util.Scanner;
public class VolumeofaCylinder {
    public static void main(String[] args) {
        double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        
        double volume = pi * radius * radius * height;
       
        System.out.print(volume);
    }
}
