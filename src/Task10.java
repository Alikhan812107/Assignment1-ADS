import java.util.Scanner;

public class Task10 {

/**
 * Recursively calculates the Greatest Common Divisor (GCD) using Euclidean Algorithm.
 * Uses the formula: GCD(a, b) = GCD(b, a % b)
 * Base case: GCD(a, 0) = a
 *
 * Time Complexity: O(log(min(a, b))) - Logarithmic complexity.
 */

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        sc.close();
    }
}
