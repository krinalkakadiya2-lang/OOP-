import java.util.*;

public class Pr32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer list (roll numbers)
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        System.out.print("Enter number of roll numbers: ");
        int n1 = sc.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.print("Enter roll number " + i + ": ");
            rollNumbers.add(sc.nextInt());
        }

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        boolean foundRoll = searchElement(rollNumbers, searchRoll);
        System.out.println("Roll number found: " + foundRoll);

        sc.nextLine(); // clear buffer

        // String list (names)
        LinkedList<String> names = new LinkedList<>();
        System.out.print("\nEnter number of names: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n2; i++) {
            System.out.print("Enter name " + i + ": ");
            names.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean foundName = searchElement(names, searchName);
        System.out.println("Name found: " + foundName);

        sc.close();
    }
}

/*
Example Output:

Enter number of roll numbers: 3
Enter roll number 1: 101
Enter roll number 2: 102
Enter roll number 3: 103
Enter roll number to search: 102
Roll number found: true

Enter number of names: 3
Enter name 1: Krinal
Enter name 2: Rahul
Enter name 3: Priya
Enter name to search: Amit
Name found: false
*/
