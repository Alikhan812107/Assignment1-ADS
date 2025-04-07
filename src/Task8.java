import java.util.Scanner;


public class Task8 {

    /**
     * The function checks if every character of s a digit (0-9)
     * Scanner reads input Strings
     * The function returns true or false in case of our inputted String
     *
     * Time complexity is O(n)
     * n is the length of a string and it goes linear
     *
     * @param s The string to check for digits
     * @return true if all characters are digits, false otherwise
     */

    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();  // Reads the next token as a String
        String s2 = scanner.next();  // Reads the next token as a String

        System.out.println(isAllDigits(s1)); // true if s1 is all digits
        System.out.println(isAllDigits(s2)); // false if s2 contains non-digits
        scanner.close();
    }
}