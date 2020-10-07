package leetcode.editor.cn;

//输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。 
//
// 例如： 
//
// 给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 10000 
// 
//
// 注意：本题与主站 104 题相同：https://leetcode-cn.com/problems/maximum-depth-of-binary-tre
//e/ 
// Related Topics 树 深度优先搜索 
// 👍 53 👎 0


import java.util.LinkedList;
import java.util.Queue;

public class ErChaShuDeShenDuLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaShuDeShenDuLcof().new Solution();
        
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
//     ----------------------------DFS-------------------------------
        if(root == null){
            return 0 ;
        }
        return Math.max(maxDepth(root.left) , maxDepth(root.right)) + 1 ;
//     -------------------------BFS----------------------------------
       /* int ans = 0 ;
        if(root == null){
            return 0 ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root) ;
        while(!queue.isEmpty()){
            int n = queue.size() ;
            for(int i = 0 ; i < n ; i++){
                TreeNode curNode = queue.poll() ;
                if(curNode.left != null){
                    queue.offer(curNode.left) ;
                }
                if(curNode.right != null){
                    queue.offer(curNode.right) ;
                }
            }
            ans++ ;
        }
        return ans ;*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}