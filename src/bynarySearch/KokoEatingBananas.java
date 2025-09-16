package bynarySearch;

public class KokoEatingBananas {

    /*
    875. Koko Eating Bananas
    leetcode link: https://leetcode.com/problems/koko-eating-bananas/
    Time complexity: O(n log m), where n is the number of piles and m is the maximum number of bananas in a pile.
    Space complexity: O(1), as we are using a constant amount of space.
    This solution uses Binary Search to find the minimum eating speed that allows Koko to eat all the bananas within h hours.
    We set the left pointer to 1 (minimum possible speed) and the right pointer to the maximum number of bananas in a pile (maximum possible speed).
    We then perform binary search to find the optimal speed.
     */
    public int minEatingSpeed(int[] piles, int h)  {
        if(piles.length == 0){
            return 0;
        }
        int left = 0, right = 0;
        for(int pile:piles)
            right = Math.max(right,pile);


        while(left<right){
            int mid = (left + right) / 2;
            int hours = 0;
            /*
            Calculate the total hours needed to eat all piles at the current speed (mid).
            We use Math.ceil to round up the division result since Koko can't eat a fraction of a pile.
             */
            for(int pile:piles){
                hours+= Math.ceil((double)pile/mid);
            }

            /*
            If the total hours needed is less than or equal to h, it means Koko can eat all bananas at this speed or slower.
            So, we try to find a slower speed by moving the right pointer to mid.
            Otherwise, if the total hours needed is greater than h, it means Koko needs to eat faster.
            So, we move the left pointer to mid + 1.    
             */
            if(hours<=h){
                right = mid;
            }else{
                left = mid + 1;
            }

        }

        return right;

    }
}
