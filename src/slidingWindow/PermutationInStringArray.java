package slidingWindow;

public class PermutationInStringArray {

    /*
        leetcode link: https://leetcode.com/problems/permutation-in-string/
        Time complexity: O(n), where n is the length of the s2 string.
        Space complexity: O(1), as we are using fixed size arrays of length 26.
        This solution uses the sliding window technique to check if any permutation of s1 is a substring of s2.
        We maintain two frequency arrays for characters in s1 and the current window in s2.
        We slide the window over s2 and update the frequency array accordingly.
        If at any point the two frequency arrays match, we return true.
     */
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false;
        }

        int []arr1 = new int[26];
        int []arr2 = new int[26];

        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        for(int start=0,end=s1.length();end<s2.length();end++){
            if(isPermutation(arr1,arr2)){
                return true;
            }

            arr2[s2.charAt(start++) - 'a']--;
            arr2[s2.charAt(end) - 'a']++;
        }

        return isPermutation(arr1,arr2);

    }

    private boolean isPermutation(int []arr1,int[] arr2){

        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }

        return true;
    }

}
