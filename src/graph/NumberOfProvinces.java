package graph;

public class NumberOfProvinces {
    /*
        leetcode link: https://leetcode.com/problems/number-of-provinces/
        Time complexity: O(n^2), where n is the number of nodes in the graph.
        Space complexity: O(n), for the visited array.
        This solution uses Depth First Search (DFS) to count the number of connected components in an undirected graph.
    */
    public int findCircleNum(int[][] isConnected) {
        boolean visited[] = new boolean[isConnected.length];
        int provinces = 0;
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                provinces++;
                dfs(visited,isConnected,i);
            }
        }

        return provinces;

    }

    public void dfs(boolean[] visited,int[][] isConnected,int node){
        visited[node] = true;
        for(int i=0;i<visited.length;i++){
            if(!visited[i] && isConnected[node][i] == 1){
                dfs(visited,isConnected,i);
            }
        }
    }

}
