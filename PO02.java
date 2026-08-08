// Read two integers a and b. Print their sum, difference, product, integer quotient, remainder, and the exact quotient as a double.

import java.util.Scanner;

public class PO2 {

    public static void main(String args[]) {
        Scanner add = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = add.nextInt();

        System.out.println("Enter second number");
        int b = add.nextInt();

        int sum = a + b;

        System.out.println("Add two number:" + sum);

    }
}
