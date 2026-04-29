public class Pr20 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide numerator and denominator.");
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error occurred.");
        }
    }
}

/*
Example Runs:

1) java pr20 10 2
Output:
Numerator: 10
Denominator: 2
Result: 5

2) java pr20 10 0
Output:
Error: Division by zero is not allowed.

3) java pr20 a b
Output:
Error: Please enter valid integers.

4) java pr20 10
Output:
Error: Please provide numerator and denominator.
*/
