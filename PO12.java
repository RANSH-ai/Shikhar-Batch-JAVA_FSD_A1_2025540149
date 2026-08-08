// Read two doubles and an operator character (+ − * / %). Print the result to 2
// decimals in the format shown. Division or modulo by zero must print "Cannot
// divide by zero"; any other operator prints "Invalid operator".
// Sample Run
// Enter a: 9
// Enter b: 4
// Enter operator (+ - * / %): /
// 9.00 / 4.00 = 2.25
import java.util.Scanner;

public class PO12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+ - * / %): ");
        char op = sc.next().charAt(0);

        double result;

        if (op == '+') {
            result = a + b;
            System.out.printf("%.2f + %.2f = %.2f\n", a, b, result);
        } else if (op == '-') {
            result = a - b;
            System.out.printf("%.2f - %.2f = %.2f\n", a, b, result);
        } else if (op == '*') {
            result = a * b;
            System.out.printf("%.2f * %.2f = %.2f\n", a, b, result);
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                result = a / b;
                System.out.printf("%.2f / %.2f = %.2f\n", a, b, result);
            }
        } else if (op == '%') {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                result = a % b;
                System.out.printf("%.2f %% %.2f = %.2f\n", a, b, result);
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}
