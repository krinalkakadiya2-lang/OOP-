// pr30

import java.util.*;

public class Pr30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}

/*
Example Output:

Enter a sentence: Java is fun and Java is powerful

Word Frequency:
java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1
*/
