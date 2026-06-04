import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained (0 - 100): ");
        double marks = scanner.nextDouble();

        // Lincoln University Grading System (typical)
        // A+: 90-100 | A: 85-89 | A-: 80-84
        // B+: 75-79  | B: 70-74 | B-: 65-69
        // C+: 60-64  | C: 55-59 | C-: 50-54
        // D: 40-49   | F: Below 40

        String grade = (marks >= 90) ? "A+" :
                       (marks >= 85) ? "A"  :
                       (marks >= 80) ? "A-" :
                       (marks >= 75) ? "B+" :
                       (marks >= 70) ? "B"  :
                       (marks >= 65) ? "B-" :
                       (marks >= 60) ? "C+" :
                       (marks >= 55) ? "C"  :
                       (marks >= 50) ? "C-" :
                       (marks >= 40) ? "D"  : "F";

        String remark = (marks >= 50) ? "Pass" : "Fail";

        System.out.println("\n--- Grade Report ---");
        System.out.println("Marks:  " + marks);
        System.out.println("Grade:  " + grade);
        System.out.println("Result: " + remark);

        scanner.close();
    }
}
