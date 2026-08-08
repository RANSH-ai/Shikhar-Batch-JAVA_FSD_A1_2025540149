// Read principal, annual rate (%) and time (years). Print Simple Interest = P·R·T/100, Compound Interest (compounded yearly) = P(1 + R/100)^T − P, and the maturity amount, all to 2 decimals.
// Sample Run
// Enter principal: 10000
// Enter rate (% p.a.): 8
// Enter time (years): 2
// Simple Interest   = 1600.00
// Compound Interest = 1664.00
// Maturity (P + CI) = 11664.00

import java.util.Scanner;
public class PO07 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal *P*:");
        int P = sc.nextInt();

        System.out.println("Rate *R*:");
        int R = sc.nextInt();

        System.out.println("Time *T*:");
        int T = sc.nextInt();

        double SimpleInterest = P * R * T / 100.0;

        double CompoundInterest = P * Math.pow(1 + R / 100.0, T) - P;

        

    
        System.out.println("Simple Interest :"+SimpleInterest);
        System.out.println("Compound Interest :"+CompoundInterest);




    }
}