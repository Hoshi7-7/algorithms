package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInStringHashMap {

    /*
        leetcode link: https://leetcode.com/problems/permutation-in-string/
        Time complexity: O(n), where n is the length of the string s2.
        Space complexity: O(1), since the size of the hashmap is bounded by the number of unique characters (at most 26 for lowercase letters).
        This solution uses the sliding window technique along with hashmaps to check for permutations of s1 in s2.
     */
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false;
        }
        Map<Character,Integer> maps1 = new HashMap<>();
        Map<Character,Integer> maps2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            maps1.put(c1,maps1.getOrDefault(c1,0) + 1);
            maps2.put(c2,maps2.getOrDefault(c2,0) + 1);
        }


        for(int end = s1.length();end<s2.length();end++){
            if(isPermutation(maps1,maps2)){
                return true;
            }
            char firstChar = s2.charAt(end - s1.length());
            char currChar = s2.charAt(end);
            maps2.put(firstChar,maps2.getOrDefault(firstChar,1) - 1);
            maps2.put(currChar,maps2.getOrDefault(currChar,0) + 1);
        }

        return isPermutation(maps1,maps2);

    }

    private boolean isPermutation(Map<Character,Integer> maps1,
                                  Map<Character,Integer> maps2){

        for (Character key : maps1.keySet()) {
            int val1 = maps1.get(key);
            int val2 = maps2.getOrDefault(key,0);
            if(val1 != val2){
                return false;
            }

        }

        return true;
    }
}
