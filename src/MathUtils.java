import java.util.Scanner;

public class MathUtils {

    // Method to calculate factorial
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to generate Fibonacci sequence up to n terms
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Display results
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        fibonacci(num);
    }
}
