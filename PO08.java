// Read an integer n (it may be negative). Using the ternary operator only — no if statement — print "Even" or "Odd", then print the last digit of |n|.
// Sample Run
// Enter n: -47
// Odd
// Last digit: 7
import java.util.Scanner;
public class PO08 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("check no is even or odd");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "Odd";

        int lastDigit = Math.abs(n) % 10;

        System.out.println(result);
        System.out.println("Last digit: " + lastDigit);
        
    }
}