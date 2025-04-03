import java.util.Scanner;

/**
 * Here I did not use a separate function...it is good to do the task without it
 * Simple code where you need to enter two numbers and calculate a^n
 * Time complexity is O(log n)
 * to calculate a^n we reduce the problem in each step,
 * halving the exponent each time, which leads to O(log n) time complexity.
 */

public class Task6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double n = sc.nextDouble();
        System.out.println(Math.pow(a, n));
        sc.close();
    }


}
