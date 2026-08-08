// Read marks (0–100). Outside that range print "Invalid marks". Otherwise: 90+
// → A+, 80–89 → A, 70–79 → B, 60–69 → C, 50–59 → D, below 50 → F.

import java.util.Scanner;

public class PO11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
