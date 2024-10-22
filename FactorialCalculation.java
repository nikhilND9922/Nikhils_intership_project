import java.util.Scanner;

public class FactorialCalculation {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.println("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate and display the factorial
        int result = factorial(number);

     System.out.println("The factorial of " + number + " is: " + result);
    }
    }