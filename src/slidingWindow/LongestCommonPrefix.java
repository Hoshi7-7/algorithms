package slidingWindow;

public class LongestCommonPrefix {
    /*
        leetcode link: https://leetcode.com/problems/longest-common-prefix/
        Time complexity: O(S * log m), where S is the sum of all characters in all strings and m is the length of the shortest string.
        Space complexity: O(1), as we are using only a constant amount of extra space.
        This solution uses binary search to find the longest common prefix among the given strings.
        We first determine the length of the shortest string, then we perform binary search on the length of the prefix.
        For each mid value, we check if all strings have the same prefix of that length.
        If they do, we move to the right half (longer prefixes), otherwise we move to the left half (shorter prefixes).
     */
    public String longestCommonPrefix(String[] strs) {
        int maxLen = Integer.MAX_VALUE;
        for(String str:strs){
            maxLen = Math.min(maxLen,str.length());
        }

        int left = 0, right = maxLen;
        while(left<=right){
            int mid = (right + left) / 2;
            String prefix = strs[0].substring(0,mid);
            if(isPrefix(prefix,strs)){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return strs[0].substring(0,(right + left) / 2);
    }

    private boolean isPrefix(String prefix,
                             String[] strs){
        for(String str:strs){
            if(!str.startsWith(prefix))
                return false;
        }
        return true;
    }
}
