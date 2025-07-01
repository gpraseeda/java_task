
    import java.util.Scanner;

    // Custom Exception
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class ExceptionHandling {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Handle ArithmeticException
            try {
                System.out.print("Enter a number to divide 100: ");
                int num = scanner.nextInt();
                int result = 100 / num;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Cannot divide by zero.");
            }

            // Handle NullPointerException
            try {
                String str = null;
                System.out.println("Length: " + str.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: String is null.");
            }

            // Handle ArrayIndexOutOfBoundsException
            try {
                int[] arr = {10, 20, 30};
                System.out.println("Element at index 5: " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds.");
            }

            // Handle Custom Exception
            try {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Custom Exception: " + e.getMessage());
            }

            scanner.close();
        }

        // Method that throws InvalidAgeException
        public static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            } else {
                System.out.println("Age is valid.");
            }
        }
    }


