// pr29

import java.util.*;

public class Pr29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("Marks: " + marks);

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        sc.close();
    }
}

/*
Example Output:

Enter number of students: 5
Enter marks of student 1: 75
Enter marks of student 2: 82
Enter marks of student 3: 68
Enter marks of student 4: 90
Enter marks of student 5: 77

Marks: [75, 82, 68, 90, 77]
Highest Marks: 90
Lowest Marks: 68
*/
