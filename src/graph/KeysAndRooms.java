package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {

    /*
        leetcode link: https://leetcode.com/problems/keys-and-rooms/
        Time complexity: O(V + E), where V is the number of rooms and E is the number of keys.
        Space complexity: O(V), for the visited array and the queue.
        This solution uses Breadth First Search (BFS) to traverse the rooms and check if all rooms can be visited.
     */
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        if(rooms.isEmpty())
            return false;
        boolean visited[] = new boolean[rooms.size()];
        visited[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(!q.isEmpty()){
            int room = q.poll();
            for(int key:rooms.get(room)){
                if(!visited[key]){
                    visited[key] = true;
                    q.add(key);
                }
            }
        }

        for(boolean room:visited){
            if(!room){
                return false;
            }
        }

        return true;


    }
}
