import java.io.*;

public class Pr26 {
    public pr26 void main(String[] args) {

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            if (args.length < 1) {
                throw new IllegalArgumentException("Please provide file name.");
            }

            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }
    }
}

/*
Example Run:

File content (test.txt):
Hello World
Java Programming

Command:
java pr26 test.txt

Output:
Lines: 2
Words: 4
Characters: 27
*/
