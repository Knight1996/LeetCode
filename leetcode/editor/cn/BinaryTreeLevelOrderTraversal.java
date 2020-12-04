package leetcode.editor.cn;

//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 
// 👍 704 👎 0

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
        
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
    public List<List<Integer>> levelOrder(TreeNode root) {
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
            ans.add(list); // 从尾插入，完成倒序
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}