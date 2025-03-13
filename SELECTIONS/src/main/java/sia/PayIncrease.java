package sia;

import java.util.Scanner;

public class PayIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Score: ");

        int score = input.nextInt();

        System.out.print("Enter Payment: ");

        int payment = input.nextInt();

        if (score > 90) {
            System.out.println(
                    payment * 3 / 100
            );
        } else {
            System.out.println(payment * 2 / 100);
        }
    }
}
