import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightPounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = sc.nextDouble();


        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;


        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("Your BMI is: " + bmi);

        sc.close();
    }
}

/*
Sample Output:

Enter weight in pounds: 150
Enter height in inches: 65
Your BMI is: 24.961029...

*/
