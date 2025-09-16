import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
    /*
        leetcode link: https://leetcode.com/problems/merge-intervals/
        Time complexity: O(n log n), where n is the number of intervals. This is due to the sorting step.
        Space complexity: O(n), for the output list in the worst case when no intervals overlap.
        This solution first sorts the intervals based on their start times, then iterates through them to merge overlapping intervals.
     */
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new LinkedList<>();
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0], b[0]));

        for(int [] interval:intervals){
            if(ans.isEmpty() || ans.getLast()[1] < interval[0]){
                ans.add(interval);
            }else{
                ans.getLast()[1] = Math.max(ans.getLast()[1],interval[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);



    }
}
