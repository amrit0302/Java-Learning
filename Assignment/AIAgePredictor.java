import java.util.Scanner;

public class AIAgePredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current age: ");
        int currentAge = scanner.nextInt();

        int currentYear = 2026;

        System.out.println("\n--- Age Predictions ---");
        System.out.println("Your age after 10 years:  " + (currentAge + 10));
        System.out.println("Your age after 25 years:  " + (currentAge + 25));
        System.out.println("Your age after 50 years:  " + (currentAge + 50));

        // Bonus: Year they will turn 100
        int yearTurn100 = currentYear + (100 - currentAge);
        System.out.println("\nBonus: You will turn 100 in the year " + yearTurn100);

        scanner.close();
    }
}
