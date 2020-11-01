package leetcode.editor.cn;

//给出一棵二叉树，其上每个结点的值都是 0 或 1 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。例如，如果路径为 0 -> 1 -> 1 ->
// 0 -> 1，那么它表示二进制数 01101，也就是 13 。 
//
// 对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。 
//
// 以 10^9 + 7 为模，返回这些数字之和。 
//
// 
//
// 示例： 
//
// 
//
// 输入：[1,0,1,0,1,0,1]
//输出：22
//解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
// 
//
// 
//
// 提示： 
//
// 
// 树中的结点数介于 1 和 1000 之间。 
// node.val 为 0 或 1 。 
// 
// Related Topics 树 
// 👍 77 👎 0

public class SumOfRootToLeafBinaryNumbers{
    public static void main(String[] args) {
        Solution solution = new SumOfRootToLeafBinaryNumbers().new Solution();
        
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

    int ans = 0 ;             //结果
    int mod = 1000000007 ;    //取模

    public int sumRootToLeaf(TreeNode root) {
        helper(root , 0);
        return ans % mod ;
    }

    public void helper(TreeNode root , int sum){
        if(root != null){
            sum = sum * 2 + root.val ;
            if(root.left == null && root.right == null){
                ans += sum ;
            }
            else{
                helper(root.left , sum);
                helper(root.right , sum);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}