
public class Fibonacci {
    /**
 * Computes the nth term of the Fibonacci sequence using recursion.
 * The sequence is 0-based: fib(0) = 0, fib(1) = 1.
 *
 * @param n the index (position) of the term to compute; must be >= 0
 * @return the nth Fibonacci number
 * @throws IllegalArgumentException if n is negative
 */


    // Recursive method to return nth Fibonacci term
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result);
    }
}

