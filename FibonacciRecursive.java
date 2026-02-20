import java.util.Scanner;

public class FibonacciRecursive {

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the position (n) of Fibonacci number: ");
        int n = scanner.nextInt();

        // Calculate and display result
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));

        scanner.close();
    }
}