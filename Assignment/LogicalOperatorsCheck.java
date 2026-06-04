import java.util.Scanner;

public class LogicalOperatorsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:  ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number:  ");
        int c = scanner.nextInt();

        if ((a + b) == c && c != 0) {
            System.out.println("Yes! " + c + " is the sum of " + a + " and " + b + ".");
        } else {
            System.out.println("No, " + c + " is NOT the sum of " + a + " and " + b + ".");
        }

        scanner.close();
    }
}
