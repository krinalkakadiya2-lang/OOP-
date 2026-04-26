import java.io.*;

public class Pr28 {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.replaceAll(" ", "").length();

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: data.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing BufferedReader.");
            }
        }
    }
}

/*
Output:
Lines: 2
Words: 5
Characters (excluding spaces): 23
*/
