package twoPointers;

public class removeDuplicatesFromSortedArray {

    /*
    leetcode link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
    Time complexity: O(n), where n is the length of the input array nums.
    Space complexity: O(1), since we are using a constant amount of extra space.
     */

    public int removeDuplicates(int[] nums) {
        int k = 1;
        int cont=1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                cont++;

            }else{
                cont=1;
            }
            if(cont<=2){
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
