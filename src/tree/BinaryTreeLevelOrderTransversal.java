package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTransversal {
    /*
        https://leetcode.com/problems/binary-tree-level-order-traversal/description/
        Time complexity: O(n), where n is the number of nodes in the binary tree.
        Space complexity: O(n), in the worst case, we might need to store all nodes in the queue.
        This solution uses a queue to traverse the binary tree level by level and collects node values at each level.
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();

        }

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode node = q.poll();
                currLevel.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }

                if(node.right!=null){
                    q.add(node.right);
                }
            }

            ans.add(currLevel);

        }

        return ans;


    }
}
