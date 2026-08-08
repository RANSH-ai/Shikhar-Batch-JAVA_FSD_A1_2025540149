
// // No input. Demonstrate: (i) widening int → long → double, (ii) narrowing double → int, (iii) char → int (Unicode code) and int → char. Label every line.
// Sample Output
// Widening : 42 -> 42 -> 42.0
// Narrowing: 99.99 -> 99
// 'A' code : 65
// 66 char  : B

public class PO04 {

    public static void main(String args[]) {
        System.out.println(" Widening : Narrowing:");
         
        int a = 9;
        long b = a;
        double c = a;

        System.out.println("Winding a=" +a+ "->" +b+ "->" +c);

         double x = 99.99;
        int y = (int) x;
        System.out.println("narrowing a=" +x+ "->" +y);
        


    
        
    }
}