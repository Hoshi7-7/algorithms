package bynarySearch;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        /*
            leetcode link: https://leetcode.com/problems/search-in-rotated-sorted-array/
            Time complexity: O(log n), where n is the length of the nums array.
            Space complexity: O(1), as we are not using any extra space.
            This solution uses binary search to find the target in the rotated sorted array.
            We first find the mid element and check if it is the target.
            If it is not, we check which side is sorted and then check if the target lies in that side.
            If it does, we search in that side, else we search in the other side.
         */
        int left = 0, right = nums.length - 1;
        while(left<=right){
            int mid = (right + left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>=nums[left]){
                if(target>=nums[left] && target<nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(target <= nums[right] && target>nums[mid]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }

        }

        return -1;
    }
}
