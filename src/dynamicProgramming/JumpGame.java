package dynamicProgramming;

public class JumpGame {

    /*
       leetcode link: https://leetcode.com/problems/jump-game/
       Time complexity: O(n^2), where n is the length of the nums array.
       Space complexity: O(n), for the dp array.
         This solution uses Dynamic Programming (DP) to determine if we can reach the last index of the array.
        We maintain a dp array where dp[i] indicates whether we can reach the last index from index i.

     */
    public boolean canJump(int[] nums) {
        boolean dp[] = new boolean[nums.length];

        dp[nums.length - 1] = true;
        for(int i = nums.length - 1;i>=0;i--){
            //max jump from current index = min(i + nums[i], last index)
            //example: if i = 3 and nums[i] = 4, we can jump to index 4,5,6,7 but if last index is 6, we can only jump to index 4,5,6
            int maxJump = Math.min(i + nums[i],nums.length - 1);
            for(int j = i + 1; j<=maxJump;j++){
                if(dp[j]){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[0];
    }
}
