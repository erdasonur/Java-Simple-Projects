package palindrome.example.with.stack;

import java.util.Stack;

public class PalindromeExampleWithStack {

    public static void main(String[] args) {
        
        String word = "madddam";
        System.out.println(checkIsItPalindrome(word) == true ? "Palindrome" : "not Palindrome");
    }
    
    public static boolean checkIsItPalindrome(String w){
        Stack<Character> stack = new Stack<Character>();
        
        int halfSize = w.length() % 2 == 0 ? w.length() / 2 : (w.length() / 2) + 1;
        
        for(int i = 0; i < w.length() / 2; i++){
            stack.push(w.charAt(i));
        }
        for(int i = halfSize  ; i < w.length(); i++){
            if(w.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
        
    }
    
}
