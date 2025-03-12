package sia;

import java.util.Scanner;

public class ComputerArea {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        final double PI = 3.14159265358979323846;

        //Computer area
        double area = radius * radius * PI;





        System.out.println("The area for the circle of raduis " + radius + " is " + area);
    }
}
