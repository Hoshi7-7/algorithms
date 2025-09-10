package twoPointers;

import java.util.*;

public class TreeSum {
/*
    leetcode link: https://leetcode.com/problems/3sum/
    Time complexity: O(n^2), where n is the length of the nums array.
    Space complexity: O(1), if we don't consider the space used for the output list.
    This solution uses sorting and the two-pointer technique to find all unique triplets in the array which gives the sum of zero.
 */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length && nums[i]<=0;i++){
            if(i==0 || nums[i] !=nums[i-1]){
                sum(nums,ans,i);
            }
        }

        return ans;
    }

    private void sum(int[] nums,List<List<Integer>> ans, int i){
        Set<Integer> visited = new HashSet<>();
        for(int j=i+1;j<nums.length;j++){
            int comp = -nums[i] - nums[j];
            if(visited.contains(comp)){
                ans.add(List.of(nums[i],nums[j],comp));
                while(j+1<nums.length && nums[j] == nums[j+1]){
                    j++;
                }
            }
            visited.add(nums[j]);
        }
    }
}
