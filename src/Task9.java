import java.util.Scanner;


public class Task9 {

    /**
     * Recursively calculates the binomial coefficient C(n, k).
     * Uses the formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base cases: C(n, 0) = C(n, n) = 1
     *
     * Time Complexity: O(2^n) - Exponential complexity due to recursion.
     *
     * @param n The total number of items
     * @param k The number of items to choose
     * @return The binomial coefficient C(n, k)
     */

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(binomialCoefficient(n, k));
    }
}