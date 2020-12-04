package leetcode.editor.cn;

//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 
//
// 例如： 
//给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其自底向上的层次遍历为： 
//
// [
//  [15,7],
//  [9,20],
//  [3]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 370 👎 0

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalIi{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversalIi().new Solution();
        
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


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//      --------------------------------BFS----------------------------------
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans ;
        }
        Queue<TreeNode> queue = new LinkedList<>() ;
        queue.offer(root) ;
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>() ;
            int size = queue.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode node = queue.poll() ;
                list.add(node.val) ;
                TreeNode left = node.left , right = node.right ;
                if(left != null){
                    queue.offer(left) ;
                }
                if(right != null){
                    queue.offer(right) ;
                }
            }
            ans.add(0 , list); // 从头插入，完成倒序
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}