package graph;

import java.util.*;

public class WordBreakGraph {

    /*
        leetcode link: https://leetcode.com/problems/word-break/
        Time complexity: O(n^2), where n is the length of the string s.
        Space complexity: O(n), for the queue and visited array.
        This solution uses Breadth First Search (BFS) to find if the string can be segmented into words from the dictionary.

     */
    public boolean wordBreak(String s, List<String> wordDict) {

        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[s.length() + 1];
        Set<String> words = new HashSet<>(wordDict);
        q.add(0);

        while(!q.isEmpty()){
            int start = q.poll();
            if(start == s.length()){
                return true;
            }

            for(int end = start + 1;end<=s.length();end++){
                if(visited[end]){
                    continue;
                }

                if(words.contains(s.substring(start,end))){

                    q.add(end);
                    visited[end] = true;
                }
            }

        }

        return false;

    }
}
