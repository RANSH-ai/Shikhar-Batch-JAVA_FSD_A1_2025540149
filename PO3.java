// Read two integers and swap them using arithmetic only — no temporary variable. Print the values before and after.

import java.util.Scanner;

public class PO3 {

    public static void main(String[] args) {

        Scanner Swap = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = Swap.nextInt();

        System.out.print("Enter second number: ");
        int b = Swap.nextInt();

        System.out.println("Before: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After : a = " + a + ", b = " + b);

        Swap.close();
    }
}