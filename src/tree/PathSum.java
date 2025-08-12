package tree;

public class PathSum {
    /*
        https://leetcode.com/problems/path-sum/description/
        Time complexity: O(n), where n is the number of nodes in the binary tree.
        Space complexity: O(h), where h is the height of the tree due to recursion stack.
        This solution checks if there is a root-to-leaf path in the binary tree such that the sum of the node values equals targetSum.
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findPath(root,targetSum);

    }

    public boolean findPath(TreeNode node, int currSum){

        if(node == null){
            return false;
        }

        currSum -= node.val;
        if(node.left == null && node.right == null){
            return currSum == 0;
        }

        return findPath(node.left,currSum) || findPath(node.right,currSum);

    }
}
