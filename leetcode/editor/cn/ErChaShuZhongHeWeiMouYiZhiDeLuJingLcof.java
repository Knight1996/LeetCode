package leetcode.editor.cn;

//输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。 
//
// 
//
// 示例: 
//给定如下二叉树，以及目标和 sum = 22， 
//
//               5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \    / \
//        7    2  5   1
// 
//
// 返回: 
//
// [
//   [5,4,11,2],
//   [5,8,4,5]
//]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 10000 
// 
//
// 注意：本题与主站 113 题相同：https://leetcode-cn.com/problems/path-sum-ii/ 
// Related Topics 树 深度优先搜索 
// 👍 105 👎 0

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErChaShuZhongHeWeiMouYiZhiDeLuJingLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaShuZhongHeWeiMouYiZhiDeLuJingLcof().new Solution();
        
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

    LinkedList<List<Integer>> ans = new LinkedList<>() ;
    LinkedList<Integer> list = new LinkedList<>() ;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root , sum) ;
        return ans ;
    }

    public void helper(TreeNode root , int sum){
        if(root == null){
            return ;
        }

        list.add(root.val) ;
        sum -= root.val ;

        // 此节点为叶节点并且路径和为目标值：
        if(sum == 0 && root.left == null && root.right == null){
            ans.add(new LinkedList(list)) ;
        }

        helper(root.left , sum) ;
        helper(root.right , sum) ;

        // 路径恢复：向上回溯前，需要将当前节点从路径list中删除
        list.removeLast() ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}