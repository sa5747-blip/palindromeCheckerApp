import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Reverse String
    static boolean reverseCheck(String word) {

        String reverse = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        return word.equals(reverse);
    }

    // Method 2: Stack
    static boolean stackCheck(String word) {

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()) {
            stack.push(c);
        }

        for(char c : word.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque
    static boolean dequeCheck(String word) {

        Deque<Character> deque = new LinkedList<>();

        for(char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Reverse Method
        long start1 = System.nanoTime();
        reverseCheck(word);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        stackCheck(word);
        long end2 = System.nanoTime();

        // Deque Method
        long start3 = System.nanoTime();
        dequeCheck(word);
        long end3 = System.nanoTime();

        System.out.println("Performance Comparison (nanoseconds)");

        System.out.println("Reverse Method: " + (end1 - start1));
        System.out.println("Stack Method: " + (end2 - start2));
        System.out.println("Deque Method: " + (end3 - start3));
    }
}
