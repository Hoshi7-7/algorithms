class TrappingRainWater {

    /*
     leetcode link: https://leetcode.com/problems/trapping-rain-water/?envType=company&envId=amazon&favoriteSlug=amazon-thirty-days
     */
    public int trap(int[] height) {
        /*
        Time complexity: O(n), Space complexity: O(1)
        This solution uses a two-pointer approach to calculate the amount of water that can be trapped
         */
        int left = 0, right = height.length - 1;
        int max_left = 0,max_right = 0;
        int ans = 0;
        while(left<right){
            if(height[left] < height[right]){
                max_left = Math.max(height[left],max_left);
                ans+=max_left-height[left++];
            }else{
                max_right = Math.max(height[right],max_right);
                ans+=max_right-height[right--];
            }
        }
        return ans;
    }
}