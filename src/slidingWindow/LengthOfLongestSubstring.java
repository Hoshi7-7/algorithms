package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    //sliding window
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, start = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                //this condition is because of this example
                // s = abba, during the loop start = 2 because the
                // second 'b' if we don't compare max with start and only retrive map.get(c) then in the second 'a'start is gonna be 1 for the first 'a' this is wrong
                start = Math.max(map.get(c),start);
            }

            ans = Math.max(i - start + 1,ans);
            map.put(c,i + 1);//if we found this char later in the loop then do not include in the window

        }

        return ans;


    }
}
