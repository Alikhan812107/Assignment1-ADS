import java.util.Scanner;

public class Task7 {

    /**
     * The function calls itself with n - 1 (to read the next number).
     * This goes before printing, so it keeps reading until n == 0.
     * Since printing goes after the recursive call, the last number read is printed first,
     * resulting in a reversed order.
     *
     * Time complexity is O(n)
     * Because the recursion is linear
     *
     * @param n The count of numbers to read and reverse
     * @param scanner The Scanner object used for input
     */
    public static void reversef(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int value = scanner.nextInt();
        reversef(n - 1, scanner);
        System.out.print(value + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reversef(n, scanner);
        scanner.close();
    }
}