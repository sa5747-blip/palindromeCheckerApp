import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("  UC4: CHARACTER ARRAY BASED PALINDROME CHECK");
        System.out.println("==============================================");

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        sc.close();
    }
}