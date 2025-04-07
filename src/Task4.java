import java.util.Scanner;



public class Task4 {

    /**
     * This function based on mathematical approach which we usually use when identifying factorial
     * it also uses recursive approach along with math.
     * for example 4! is 4 * 3! which is 3 * 2! which is 2 * 1! which is 1 * 0! which is the base case??? or final point???
     * Time complexity is O(n)
     *
     * @param n The non-negative integer for which to calculate factorial
     * @return The factorial of the given number n
     **/

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // just a main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }
}