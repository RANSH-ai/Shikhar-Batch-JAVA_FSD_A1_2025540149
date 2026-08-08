// Read the radius (double). Print the area and circumference using Math.PI, both rounded to 2 decimal places with printf.
import java.util.Scanner;
public class PO05 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

         System.out.printf("input:r:->");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;
        //  System.out.println("Area:%.2f%n" +area+ "\ncircumference:%.2f%n"+circumference);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);
    }
}