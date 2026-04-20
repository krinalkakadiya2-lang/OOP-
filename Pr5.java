import java.util.Scanner;

public class Pr5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        
        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Triangle is valid.");
            System.out.println("Area of triangle: " + area);

        } else {
            System.out.println("Invalid triangle! The given sides do not form a triangle.");
        }

        sc.close();
    }
}
/*
Enter side a: 3
Enter side b: 4
Enter side c: 5
Triangle is valid.
Area of triangle: 6.0
*/
