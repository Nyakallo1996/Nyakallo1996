package sia;

import java.util.Scanner;



public class Radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius : ");

        int radius = input.nextInt();

        double PI = 3.14;

        if (radius >= 0) {
           double area = radius * radius * PI;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
        else {
            System.out.println("Negative input");
        }

    }
}
