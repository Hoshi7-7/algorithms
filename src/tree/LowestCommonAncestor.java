package tree;

public class LowestCommonAncestor {
    /*

     */
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        helper(root,p,q);
        return ans;

    }

    public boolean helper(TreeNode node, TreeNode p, TreeNode q){

        if(node == null){
            return false;
        }

        int left = helper(node.left,p,q) ? 1:0 ;
        int right = helper(node.right,p,q) ? 1:0;

        int currNode = node == p || node == q ? 1:0;

        if(currNode + left + right >=2){
            this.ans = node;
        }

        return left + right + currNode> 0;

    }
}
