package tree;

public class MaximumDepthOfBinaryTree {

    /*
        https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
        Time complexity: O(n), where n is the number of nodes in the binary tree.
        Space complexity: O(h), where h is the height of the tree, due to the recursion stack.
        This solution calculates the maximum depth of a binary tree by recursively finding the depth of each subtree.
     */
    public int maxDepth(TreeNode root) {
        return getDepth(root);

    }

    public int getDepth(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = getDepth(node.left);
        int right = getDepth(node.right);
        return Math.max(left,right) + 1;

    }
}
