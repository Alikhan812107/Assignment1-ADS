
// importing a scanner allows to read and take what user inputted (or inputting)
import java.util.Scanner;

// "findMinimum" method is a playing a role of a function which mainly finds the lowest value in an array
// By assuming the container min is the first element of an array (which is minimum value(not yet)), it compares with other values in an array and makes decision what is the lowest



public class Task1 {

    /**
     * Finds the minimum value in an array of integers.
     * Time complexity is O(n) because the loop will iterate n times (same as the array length),
     * which makes it linear.
     *
     * @param arr array of numbers to search for the minimum value
     * @return minimum element in the array
     */

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //In the main function according to n numbers from an input it creates an array of size n and runs a findMinimum function, prints the result and closes the scanner which is also important.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMinimum(arr));
        scanner.close();
    }
}
