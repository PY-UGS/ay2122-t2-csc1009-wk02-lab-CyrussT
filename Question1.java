import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        final double PI = 3.14159; // declaring constant PI as 3.14159
        Scanner input = new Scanner(System.in); // Set scanner as input
        System.out.print("Please enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI; //area = radius^2 * PI
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
