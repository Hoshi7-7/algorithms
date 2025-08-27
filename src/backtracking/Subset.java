package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    /*
        leetcode link: https://leetcode.com/problems/subsets/
        Time complexity: O(n * 2^n), where n is the length of the nums array.
        Space complexity: O(n), for the recursion stack and the current subset.
        This solution uses backtracking to generate all possible subsets of the given array.
     */
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        backtracking(0,nums,new ArrayList<>());
        return ans;
    }

    private void backtracking(int pos,int[]nums,List<Integer> currSubset){

        ans.add(new ArrayList<>(currSubset));
        for(int i = pos;i<nums.length;i++){
            currSubset.add(nums[i]);
            backtracking(i+1,nums,currSubset);
            currSubset.remove(currSubset.size() - 1);
        }
    }
}
