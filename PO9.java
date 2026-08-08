// Read three integers and print the largest using nested if-else. Do not use Math.max.
// Sample Run
// Enter three numbers: 12 45 7
// Largest = 45
import java.util.Scanner;
public class PO9 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            System.out.println(a);
        }else if(b>c){
            System.out.println(b);
        }else if (a>c){
            System.out.println(a);
        }else{
            System.out.println("this is our largest number:::"+c);
        }
        

    }
}