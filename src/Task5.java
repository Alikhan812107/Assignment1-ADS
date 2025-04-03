import java.util.Scanner;

/**
 * This program helps you find certain fibonacci number by index. (for example 5th index is 1597...)
 * The recursive approach was used
 * Time complexity is O(2^n)
 * Because the iteration of execution splits into 2 when we call the function
 * It is based on fibonacci approach.
 */

public class Task5 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("F(" + n + ") = " + fibonacci(n));
        scanner.close();
    }
}
