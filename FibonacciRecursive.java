public class FibonacciRecursive {

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation
    }

    public static void main(String[] args) {
        int n = 10; // Example: find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
