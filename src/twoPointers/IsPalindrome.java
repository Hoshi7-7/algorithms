package twoPointers;

public class IsPalindrome {
    /*
        leetcode link: https://leetcode.com/problems/valid-palindrome/
        Time complexity: O(n), where n is the length of the string.
        Space complexity: O(n), for the new string after removing non-alphanumeric characters.
        This solution uses two pointers to check if the string is a palindrome after removing non-alphanumeric characters and converting to lowercase.
     */
    public boolean isPalindrome(String s) {

        s = removeChars(s);
        int start = 0,end = s.length()- 1;
        while(start<end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }

        return true;

    }

    private String removeChars(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();

    }
}
