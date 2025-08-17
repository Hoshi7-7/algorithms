package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    /*
        https://leetcode.com/problems/valid-parentheses/description/
        Time complexity: O(n), where n is the length of the input string.
        Space complexity: O(n), in the worst case, we might need to store all characters in the stack.
        This solution uses a stack to validate if the parentheses are balanced and correctly nested.
     */
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ')' || c == '}' || c == ']'){
                char last = stack.isEmpty() ? '#' : stack.pop();
                if(map.get(c) != last){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();

    }
}
