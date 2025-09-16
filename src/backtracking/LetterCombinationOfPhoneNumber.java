package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    /*
        leetcode link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
        Time complexity: O(3^m * 4^n), where m is the number of digits that map to 3 letters and n is the number of digits that map to 4 letters.
        Space complexity: O(m + n), for the recursion stack and the current combination.
        This solution uses backtracking to generate all possible letter combinations for the given digit string.
     */
    Map<Character, String> map = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        helper(digits,0,new StringBuilder(),ans);
        return ans;

    }

    private void helper(String digits,int i,
                        StringBuilder combination,List<String> ans){

        if(digits.length() == combination.length()){
            ans.add(combination.toString());
            return;
        }

        char digit = digits.charAt(i);
        String letters = map.get(digit);
        for(char c:letters.toCharArray()){
            combination.append(c);
            helper(digits,i+1,combination,ans);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
