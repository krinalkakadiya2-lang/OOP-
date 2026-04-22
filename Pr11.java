import java.util.Scanner;

class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        Scanner sc = new Scanner(System.in);

        void acceptDetails() {
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name : " + collegeName);
            System.out.println("Student Name : " + studentName);
            System.out.println("Course       : " + course);
        }
    }
}

public class Pr11 {
    public static void main(String[] args) {
        College college = new College("ABC Engineering College");
        College.Admission admission = college.new Admission();

        admission.acceptDetails();
        admission.displayDetails();
    }
  
}/*
Sample Output:

Enter Student Name: Krinal
Enter Course: Computer Engineering

--- Admission Details ---
College Name : ABC Engineering College
Student Name : Krinal
Course       : Computer Engineering
*/
