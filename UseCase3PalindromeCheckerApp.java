public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Application Entry & Welcome Message
        System.out.println("================================");
        System.out.println("   PALINDROME CHECKER APP");
        System.out.println("================================");
        System.out.println("Application Name : Palindrome Checker");
        System.out.println("Version : 1.0");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println();

        // UC2: Hardcoded Palindrome Result
        String word = "madam";
        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if(word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        System.out.println();

        // UC3: Palindrome Check Using String Reverse
        String input = "level";
        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if(input.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

    }
}