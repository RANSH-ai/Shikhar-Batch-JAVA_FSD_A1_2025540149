// Read a temperature in Celsius and print Fahrenheit (F = C × 9/5 + 32). Then read a Fahrenheit value and print Celsius. One decimal place each.

import java.util.Scanner;

public class PO6 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius:");
        double cel = sc.nextDouble();

        double Fahrenheit = cel * 1.8 + 32;
        System.out.println("so this is Fahrenhiet:"+Fahrenheit);
        System.out.println(+Fahrenheit+ "F =" +cel+ "C");


        





    

    }
}