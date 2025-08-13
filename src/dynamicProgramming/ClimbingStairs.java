package dynamicProgramming;

public class ClimbingStairs {
    /*
        https://leetcode.com/problems/climbing-stairs/description/
        Time complexity: O(n), where n is the number of steps.
        Space complexity: O(n), due to the dp array used to store the number of ways to reach each step.
        This solution uses dynamic programming to calculate the number of distinct ways to climb to the nth step.
     */
    public int climbStairs(int n) {
        int[]dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

    }
}
