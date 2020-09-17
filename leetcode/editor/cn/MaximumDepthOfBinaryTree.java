package leetcode.editor.cn;

//给定一个二叉树，找出其最大深度。 
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例： 
//给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
// Related Topics 树 深度优先搜索 
// 👍 697 👎 0

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree{
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
        
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
    public int maxDepth(TreeNode root) {
//        --------------------------DFS 递归----------------------------
        if(root == null){
            return 0 ;
        }
        else{
            int leftHeight = maxDepth(root.left) ;
            int rightHeight = maxDepth(root.right) ;
            return Math.max(leftHeight , rightHeight) + 1 ;
        }
//        ---------------------------------------------------------------

//        ----------------------------BFS 迭代---------------------------
       /* if(root == null){
            return 0 ;
        }
        //队列中存放每一层的节点
        Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
        queue.offer(root) ;
        int ans = 0 ;
        while(!queue.isEmpty()){
            int len = queue.size() ;
            while(len > 0){
                TreeNode node = queue.poll() ;
                if(node.left != null){
                    queue.offer(node.left) ;
                }
                if(node.right != null){
                    queue.offer(node.right) ;
                }
                len-- ;
            }
            ans++ ;
        }
        return ans ;*/
//        ----------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}