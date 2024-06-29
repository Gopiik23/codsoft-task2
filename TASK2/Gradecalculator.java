package TASK2;
import java.util.Scanner;

public class Gradecalculator {

    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double[] marks = new double[numberOfSubjects];
        double totalMarks = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        double averagePercentage = totalMarks / numberOfSubjects;
        String grade = calculateGrade(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
