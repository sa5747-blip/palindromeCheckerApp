public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String word = "level";

        // Variable to store reversed string
        String reverse = "";

        // Reverse the string using loop
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // Compare original and reversed string
        if(word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}