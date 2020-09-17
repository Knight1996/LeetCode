package leetcode.editor.cn;

//给定一个二叉树，检查它是否是镜像对称的。 
//
// 
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
//     1
//   / \
//  2   2
// / \ / \
//3  4 4  3
// 
//
// 
//
// 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
//     1
//   / \
//  2   2
//   \   \
//   3    3
// 
//
// 
//
// 进阶： 
//
// 你可以运用递归和迭代两种方法解决这个问题吗？ 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 1020 👎 0

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree{
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
        
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
    public boolean isSymmetric(TreeNode root) {
        return check(root , root) ;
    }

    public boolean check(TreeNode root1 , TreeNode root2){
//     ---------------------------- 递归 -----------------------------------
        if(root1 == null && root2 == null){
            return true ;
        }
        if(root1 == null || root2 == null){
            return false ;
        }
        return root1.val == root2.val
                && check(root1.left , root2.right)
                && check(root1.right , root2.left) ;
//     ----------------------------------------------------------------------

//     ---------------------------- 迭代 -------------------------------------
       /* Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
        queue.offer(root1) ;
        queue.offer(root2) ;
        while(! queue.isEmpty()){
            root1 = queue.poll() ;
            root2 = queue.poll() ;
            if(root1 == null && root2 == null){
                continue ;
            }
            if((root1 == null || root2 == null) || (root1.val != root2.val)){
                return false ;
            }

            queue.offer(root1.left) ;
            queue.offer(root2.right) ;

            queue.offer(root2.left) ;
            queue.offer(root1.right) ;
        }
        return true ;*/
//     ------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}