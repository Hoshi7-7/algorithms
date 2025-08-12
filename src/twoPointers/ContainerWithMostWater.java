package twoPointers;

public class ContainerWithMostWater {

    /*
    leetcode link: https://leetcode.com/problems/container-with-most-water/
     */
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        // Using two pointers to find the maximum area
        // Time complexity: O(n), Space complexity: O(1)
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, width * minHeight);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
