import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
/*
    https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
    Time complexity: O(n), where n is the number of kids (length of the candies array).
    Space complexity: O(n), for storing the result in a list.
    This solution finds the maximum number of candies any kid has and checks if each kid can have the greatest number of candies
    by adding extraCandies to their current count.
 */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        if(candies.length == 0){
            return ans;
        }

        int max = 0;
        int len = candies.length;
        for(int i=0;i<len;i++){
            max = Math.max(max,candies[i]);
        }

        for(int i=0;i<len;i++){
            ans.add(candies[i] + extraCandies >= max);
        }

        return ans;
    }
}
