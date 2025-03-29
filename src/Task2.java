// importing scanner
import java.util.Scanner;

// function which finds an average
public class Task2 {
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    //main function which reads user input and runs a function, processes the result and closing a scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findAverage(arr));
        scanner.close();
    }
}
