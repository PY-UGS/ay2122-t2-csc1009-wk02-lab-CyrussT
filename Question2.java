import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        double average = (a + b + c) / 3;
        System.out.println("The average of " + a + " " + b + " " + c + " is " + average);
    }
}
