// Read a year and report whether it is a leap year. Rule: divisible by 4 and not by 100, OR divisible by 400. (Test with 2024, 1900 and 2000.)
// Sample Run
// Enter year: 1900
// 1900 is NOT a Leap Year

import java.util.Scanner;
public class PO10 {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("please type year:");
        int Year = sc.nextInt();

        if((Year%4==0 && Year%100 != 0 || Year%400==0)){
            System.out.print(Year+"-is a leap year.");

        }else{
            System.out.print(Year+"-is not a year. ");
        }
        
    }

}