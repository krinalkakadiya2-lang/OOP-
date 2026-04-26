import java.io.*;
import java.util.Scanner;

public class Pr27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File file = new File("students.txt");

        FileWriter fw = null;

        try {
            fw = new FileWriter(file);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter details for student " + i + ":");

                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                fw.write(roll + " " + name + " " + marks + "\n");
            }

            System.out.println("\nData written to file successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                System.out.println("Error closing FileWriter.");
            }
        }

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader.");
            }
        }

        sc.close();
    }
}

/*
Example Output:

Enter number of students: 2
Enter details for student 1:
Roll No: 101
Name: Krinal
Marks: 75
Enter details for student 2:
Roll No: 102
Name: Rahul
Marks: 82

Data written to file successfully.

Student Records:
101 Krinal 75
102 Rahul 82
*/
