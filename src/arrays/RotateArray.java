package arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        /*
            leetcode link: https://leetcode.com/problems/rotate-array/
            Time complexity: O(n), where n is the length of the nums array.
            Space complexity: O(1), as we are doing the rotation in place.
            This solution uses the reverse method to rotate the array.
            First, we reverse the entire array.
            Then, we reverse the first k elements.
            Finally, we reverse the remaining n-k elements.
         */
        k=k%nums.length;
        int len = nums.length;
        reverse(0,len - 1,nums);
        reverse(0,k - 1,nums);
        reverse(k,len - 1,nums);

    }

    private void reverse(int start,int end, int[]nums){
        while(start<end){
            int aux = nums[start];
            nums[start++] = nums[end];
            nums[end--] = aux;
        }
    }
}
