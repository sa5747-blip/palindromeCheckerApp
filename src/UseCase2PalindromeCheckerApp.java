public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("  UC2: HARDCODED PALINDROME CHECK");
        System.out.println("========================================");

        // Hardcoded string literal
        String word = "madam";

        String reversed = "";

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional check
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        System.out.println("Program Execution Completed.");
    }
}