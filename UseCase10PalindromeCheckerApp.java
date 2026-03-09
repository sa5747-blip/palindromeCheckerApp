public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the string
        for(int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if(normalized.equals(reversed)) {
            System.out.println(input + " is a Palindrome (ignoring case and spaces)");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}