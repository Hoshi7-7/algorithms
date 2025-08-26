package graph;

import java.util.List;

public class WordBreakDP {
    /*
        leetcode link: https://leetcode.com/problems/word-break/
        Time complexity: O(n^2), where n is the length of the string s.
        Space complexity: O(n), for the dp array.
        This solution uses Dynamic Programming (DP) to find if the string can be segmented into words from the dictionary.

     */
    public boolean wordBreak(String s, List<String> wordDict) {
        java.util.Set<String> wordSet = new java.util.HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
