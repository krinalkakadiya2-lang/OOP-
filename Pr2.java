import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;
    
        System.out.print("Enter value of a: ");
        a = sc.nextDouble();
        
        System.out.print("Enter value of b: ");
        b = sc.nextDouble();
        
        System.out.print("Enter value of c: ");
        c = sc.nextDouble();
        
        System.out.print("Enter value of d: ");
        d = sc.nextDouble();
        
        System.out.print("Enter value of e: ");
        e = sc.nextDouble();
        
        System.out.print("Enter value of f: ");
        f = sc.nextDouble();

        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;

  
        if (D == 0) {
            System.out.println("No unique solution exists (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Value of x = " + x);
            System.out.println("Value of y = " + y);
        }

        sc.close();
    }
}/*
Enter value of a: 2
Enter value of b: 3
Enter value of c: 1
Enter value of d: 2
Enter value of e: 8
Enter value of f: 5

Value of x = 1.0
Value of y = 2.0
*/
