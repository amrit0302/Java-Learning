import java.util.Scanner;

public class SmartAttendanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of classes conducted: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;

        System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercentage);

        if (attendancePercentage >= 75) {
            System.out.println("Status: Eligible for Exam");
        } else {
            System.out.println("Status: Not Eligible");
        }

        scanner.close();
    }
}
