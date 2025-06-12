import java.util.Scanner;
public class AreaofaCircle {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner((System.in));
        System.out.print("enter the radius of circle:- ");
        double radius = sc.nextInt();
        double area = pi * radius*radius;
        System.out.println(area);
    }
    
}
