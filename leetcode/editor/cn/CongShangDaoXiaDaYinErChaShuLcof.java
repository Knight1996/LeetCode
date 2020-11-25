package leetcode.editor.cn;

//从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。 
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
// 返回： 
//
// [3,9,20,15,7]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
// Related Topics 树 广度优先搜索 
// 👍 46 👎 0

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CongShangDaoXiaDaYinErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuLcof().new Solution();
        
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
    public int[] levelOrder(TreeNode root) {
        // 借助一个队列，通过 BFS 实现按层遍历二叉树
        Queue<TreeNode> queue = new LinkedList<>() ;
        // 申请一个动态数组 ArrayList 动态添加节点值
        ArrayList<Integer> ans = new ArrayList<>() ;

        // 根结点先入队
        if(root != null){
            queue.add(root) ;
        }

        while(!queue.isEmpty()){
            // 取出当前队首元素
            TreeNode node = queue.poll() ;
            ans.add(node.val) ;
            // 左子节点入队
            if(node.left != null){
                queue.add(node.left) ;
            }
            // 右子节点入队
            if(node.right != null){
                queue.add(node.right) ;
            }
        }

        // 将 ArrayList 转为 int数组并返回
        int[] res = new int[ans.size()] ;
        for(int i = 0 ; i < ans.size() ; i++){
            res[i] = ans.get(i) ;
        }

        return res ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}