import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);

  
        ch = Character.toLowerCase(ch);

        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a Vowel.");
            } else {
                System.out.println("It is a Consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter a letter.");
        }

        sc.close();
    }
}/*
Enter a single letter: A
It is a Vowel.
*/
