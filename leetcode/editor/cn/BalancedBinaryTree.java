package leetcode.editor.cn;

//给定一个二叉树，判断它是否是高度平衡的二叉树。 
//
// 本题中，一棵高度平衡二叉树定义为： 
//
// 
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。 
// 
//
// 示例 1: 
//
// 给定二叉树 [3,9,20,null,null,15,7] 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回 true 。 
// 
//示例 2: 
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4] 
//
//        1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
// 
//
// 返回 false 。 
//
// 
// Related Topics 树 深度优先搜索 
// 👍 475 👎 0

public class BalancedBinaryTree{

    public static void main(String[] args) {
        Solution solution = new BalancedBinaryTree().new Solution();
        
    }


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    boolean flag = true ;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return flag ;

    }

    public int height(TreeNode root){
        if(root == null){
            return 0 ;
        }
        int leftHeight = height(root.left) + 1 ;
        int rightHeight = height(root.right) + 1 ;

        if(Math.abs(leftHeight - rightHeight) > 1){
            flag = false;
        }

        return Math.max(leftHeight , rightHeight) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}