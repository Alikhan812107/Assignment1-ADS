import java.util.Scanner;

public class Task3 {
    /**
     * Here I used mathematical approach to identify whether the input number is prime or not.
     * If one of the factors of n is less or equal than square root of n, then it is composite
     * That is why time complexity is O(sqrt(n))
     **/

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (isPrime(n)) {
            System.out.println(n + " Prime");
        } else {
            System.out.println(n + " Composite");
        }
    }
}
