public class moveZeroes {
    /*
    leetcode link: https://leetcode.com/problems/move-zeroes/
    Time complexity: O(n), where n is the length of the input array nums.
    
     */
    public void moveZeroes(int[] nums) {
        int p = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[p++] = nums[i];
            }
        }

        for(int i=p;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
