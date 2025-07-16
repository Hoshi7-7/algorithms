import java.util.*;

public class GroupOfAnagrams {
    /*
        https://leetcode.com/problems/group-anagrams/?envType=company&envId=amazon&favoriteSlug=amazon-thirty-days
        Time complexity: O(n * k), where n is the number of strings and k is the maximum length of a string.
        Space complexity: O(n * k), where n is the number of strings and k is the maximum length of a string.
        at the end we are returning a list of lists, so the space complexity is O(n * k) because we store all strings in the map.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        int chars[] = new int [26];
        for(String str:strs){
            Arrays.fill(chars,0);
            findAnagram(chars,str);
            String key = getKey(chars);
            map.computeIfAbsent(key,val->new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());


    }

    private void findAnagram(int chars[],String str){
        for(char c:str.toCharArray()){
            chars[c - 'a']++;
        }
    }

    private String getKey(int chars[]){
        StringBuilder sb = new StringBuilder();
        for(int c:chars){
            sb.append("#").append(c);
        }
        return sb.toString();
    }

}
