import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push and enqueue characters
        for(int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
            queue.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare stack pop with queue dequeue
        while(!stack.isEmpty()){
            if(stack.pop() != queue.remove()){
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if(isPalindrome){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}