
import java.util.Scanner;

public class Task3 {

    public static int Primeidentifier (int n) {

        if (n%n == 0 && n%1 == 0) {
            return
        }

        return (int) n*n;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();



        System.out.println(Primeidentifier(n));

        scanner.close();
    }

}
