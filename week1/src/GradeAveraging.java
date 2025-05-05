import java.util.Scanner;

public class GradeAveraging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade;
        double total = 0;
        double average;
        int counter = 1;

        while (counter <= 5) {
            System.out.print("Please enter your " + counter + " numerical grade: ");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        }

        average = total / (counter - 1);
        System.out.println("You have earned an average grade of " + average);

        char letterGrade;
        String message;

        if (average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "Excellent work!";
        } else if (average >= 80) {
            letterGrade = 'B';
            message = "Solid work!";
        } else if (average >= 70) {
            letterGrade = 'C';
            message = "More studying necessary.";
        } else if (average >= 60) {
            letterGrade = 'D';
            message = "Squeaking by!";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade.";
        }

        System.out.println("You have earned the following letter grade: " + letterGrade);
        System.out.println("Here is the message: " + message);
    }
}
