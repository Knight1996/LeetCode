package leetcode.editor.cn;

//给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。 
//
// 二叉搜索树保证具有唯一的值。 
//
// 
//
// 示例 1： 
//
// 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
//输出：32
// 
//
// 示例 2： 
//
// 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
//输出：23
// 
//
// 
//
// 提示： 
//
// 
// 树中的结点数量最多为 10000 个。 
// 最终的答案保证小于 2^31。 
// 
// Related Topics 树 递归 
// 👍 133 👎 0

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBst{
    public static void main(String[] args) {
        Solution solution = new RangeSumOfBst().new Solution();
        
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
    public int rangeSumBST(TreeNode root, int L, int R) {
//    -------------------------DFS------------------------------
        if(root == null){
            return 0 ;
        }
        int tem = 0 ;
        if(root.val >= L && root.val <= R){
            tem = root.val ;
        }
        return tem + rangeSumBST(root.left , L , R) + rangeSumBST(root.right , L , R) ;

//    -------------------------BFS-------------------------------
        /*if(root == null){
            return 0 ;
        }
        int sum = 0 ;
        Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
        queue.offer(root) ;
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur.val >= L && cur.val <= R){
                sum += cur.val ;
            }
            if(cur.left != null){
                queue.offer(cur.left) ;
            }
            if(cur.right != null){
                queue.offer(cur.right) ;
            }
        }
        return sum ;*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}