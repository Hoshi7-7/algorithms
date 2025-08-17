package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    /*
        https://leetcode.com/problems/longest-repeating-character-replacement/description/
        Time complexity: O(n), where n is the length of the input string.
        Space complexity: O(1), since the size of the map is limited to the number of uppercase English letters (26).
        This solution uses a sliding window approach to find the longest substring that can be transformed into a string with all identical characters
        by replacing at most k characters.
     */
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int start = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));
            // Current window size is (i - start + 1)
            if (i - start + 1 - maxFreq > k) {
                // We need to shrink the window from the left
                // example: AABABBA, k = 1
                // when we reach the second B at index 4, the window is AABAB
                // maxFreq is 3 (A's), window size is 5, we need to shrink the window
                // so we remove the leftmost character (A at index 0)
                // and move start to the right
                char leftChar = s.charAt(start);
                map.put(leftChar, map.get(leftChar) - 1);
                start++;
            }
            ans = i - start + 1;
        }
        return ans;
    }
}
