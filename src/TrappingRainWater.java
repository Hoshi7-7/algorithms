class TrappingRainWater {
    public int trap(int[] height) {
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