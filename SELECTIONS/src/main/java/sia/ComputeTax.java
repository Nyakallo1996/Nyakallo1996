package sia;

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter filing status
        System .out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status");

        int status = input.nextInt();

        //prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        //Compute tax
        double tax = 0;

        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
        }
    }
}
