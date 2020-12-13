package leetcode.editor.cn;

//给定一个二叉树，判断其是否是一个有效的二叉搜索树。 
//
// 假设一个二叉搜索树具有如下特征： 
//
// 
// 节点的左子树只包含小于当前节点的数。 
// 节点的右子树只包含大于当前节点的数。 
// 所有左子树和右子树自身必须也是二叉搜索树。 
// 
//
// 示例 1: 
//
// 输入:
//    2
//   / \
//  1   3
//输出: true
// 
//
// 示例 2: 
//
// 输入:
//    5
//   / \
//  1   4
//     / \
//    3   6
//输出: false
//解释: 输入为: [5,1,4,null,null,3,6]。
//     根节点的值为 5 ，但是其右子节点值为 4 。
// 
// Related Topics 树 深度优先搜索 递归 
// 👍 857 👎 0

public class ValidateBinarySearchTree{
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long pre = Long.MIN_VALUE ;
    public boolean isValidBST(TreeNode root) {
//      -----------------------------------递归-----------------------------------
        //return helper(root , null , null) ;
//      --------------------------------中序遍历-----------------------------------
        if(root == null){
            return true ;
        }
        // 访问左子树：
        if(!isValidBST(root.left)){
            return false ;
        }
        // 访问当前节点：
        // 如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
        if(root.val <= pre){
            return false ;
        }
        pre = root.val ;
        // 访问右子树：
        return isValidBST(root.right) ;
    }

    /*public boolean helper(TreeNode node , TreeNode leftNode , TreeNode rightNode){
        if(node == null){
            return true ;
        }
        int val = node.val ;
        if(leftNode != null && val <= leftNode.val){
            return false ;
        }
        if(rightNode != null && val >= rightNode.val){
            return false ;
        }
        // 对于左子树的所有节点值来说，最小值为 leftNode，最大值为 node :
        // 对于右子树的所有节点值来说，最小值为 node，最大值为 rightNode :
        return helper(node.left , leftNode , node) && helper(node.right , node , rightNode);
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}