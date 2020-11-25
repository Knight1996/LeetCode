package leetcode.editor.cn;

//从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。 
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
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
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
//
// 注意：本题与主站 102 题相同：https://leetcode-cn.com/problems/binary-tree-level-order-tra
//versal/ 
// Related Topics 树 广度优先搜索 
// 👍 61 👎 0

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CongShangDaoXiaDaYinErChaShuIiLcof{
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuIiLcof().new Solution();
        
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
        // 借助一个队列，通过 BFS 实现按层遍历二叉树
        Queue<TreeNode> queue = new LinkedList<>() ;
        // 申请一个动态数组 ArrayList 动态添加节点值
        List<List<Integer>> ans = new ArrayList<>() ;

        // 根结点先入队
        if(root != null){
            queue.add(root) ;
        }

        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>() ;
            for(int i = queue.size() ; i > 0 ; i--){
                // 取出当前队首元素
                TreeNode node = queue.poll() ;
                list.add(node.val) ;
                // 左子节点入队
                if(node.left != null){
                    queue.add(node.left) ;
                }
                // 右子节点入队
                if(node.right != null){
                    queue.add(node.right) ;
                }
            }
            ans.add(list) ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}