package twoPointers;

public class IsSubsequence {

    /*
        leetcode link: https://leetcode.com/problems/is-subsequence/
        Time complexity: O(n + m), where n is the length of string s and m is the length of string t.
        Space complexity: O(1), as we are using only two pointers.
        This solution uses two pointers to check if string s is a subsequence of string t.
        We iterate through both strings, and whenever we find a matching character, we move the pointer of string s.
        If we reach the end of string s, it means all characters were found in order in string t.
     */
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
