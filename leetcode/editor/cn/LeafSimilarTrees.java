package leetcode.editor.cn;

//请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。 
//
// 
//
// 举个例子，如上图所示，给定一颗叶值序列为 (6, 7, 4, 9, 8) 的树。 
//
// 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。 
//
// 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。 
//
// 
//
// 提示： 
//
// 
// 给定的两颗树可能会有 1 到 200 个结点。 
// 给定的两颗树上的值介于 0 到 200 之间。 
// 
// Related Topics 树 深度优先搜索 
// 👍 68 👎 0

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees{
    public static void main(String[] args) {
        Solution solution = new LeafSimilarTrees().new Solution();
        
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//     -----------------------------DFS--------------------------------
        List<Integer> leaf1 = new ArrayList<>() ;
        List<Integer> leaf2 = new ArrayList<>() ;
        dfs(root1 , leaf1) ;
        dfs(root2 , leaf2) ;
        return leaf1.equals(leaf2) ;
    }

    public void dfs(TreeNode root , List<Integer> list){
        if(root != null){
            if(root.left == null && root.right == null){
                list.add(root.val) ;
            }
            dfs(root.left , list) ;
            dfs(root.right , list) ;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}