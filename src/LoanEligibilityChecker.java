import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Age, Income, Credit Score
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your monthly income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();

        // Eligibility Check
        if (age >= 21 && age <= 60) {
            if (income >= 3000) {
                if (creditScore >= 700) {
                    System.out.println("You are eligible for the loan.");
                } else if (creditScore >= 600) {
                    System.out.println("You are partially eligible for the loan.");
                } else {
                    System.out.println("You are not eligible for the loan due to low credit score.");
                }
            } else {
                System.out.println("You are not eligible due to low income.");
            }
        } else {
            System.out.println("You are not eligible due to age restrictions.");
        }

        scanner.close();
    }
}

