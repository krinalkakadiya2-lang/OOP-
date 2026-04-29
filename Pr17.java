interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Pr17 {
    public pr17 void main(String[] args) {
        Result r = new Result();

        int marks = 55;
        double average = 58.5;

        if (r.isPassed(marks)) {
            System.out.println("Student Passed with marks: " + marks);
        } else {
            System.out.println("Student Failed with marks: " + marks);
        }

        String division = r.getDivision(average);
        System.out.println("Division: " + division);
    }
}

/*
Output:
Student Passed with marks: 55
Division: Second Division
*/
