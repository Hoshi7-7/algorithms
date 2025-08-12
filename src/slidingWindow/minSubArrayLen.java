package slidingWindow;

public class minSubArrayLen {
    /*
        leetcode link: https://leetcode.com/problems/minimum-size-subarray-sum/
        Time complexity: O(n), where n is the length of the input array nums.
        Space complexity: O(1), since we are using a constant amount of extra space.
        This solution uses a sliding window approach to find the minimum length of a contiguous subarray
        whose sum is greater than or equal to the target value.
     */
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE, currSum = 0,start=0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            while(currSum>=target){
                ans = Math.min(ans,i-start + 1);
                currSum-=nums[start++];
            }
        }

        return ans == Integer.MAX_VALUE ? 0:ans;
    }
}
