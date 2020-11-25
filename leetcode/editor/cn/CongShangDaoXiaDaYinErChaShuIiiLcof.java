package leetcode.editor.cn;

//请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。 
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
//  [20,9],
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
// Related Topics 树 广度优先搜索 
// 👍 53 👎 0

import javax.swing.tree.TreeNode;
import java.util.*;

public class CongShangDaoXiaDaYinErChaShuIiiLcof{
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuIiiLcof().new Solution();
        
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
            LinkedList<Integer> list = new LinkedList<>() ;
            for(int i = queue.size() ; i > 0 ; i--){
                // 取出当前队首元素
                TreeNode node = queue.poll() ;
                // 在偶数层，增加到队列尾部：
                if(ans.size() % 2 == 0){
                    list.addLast(node.val) ;
                }
                // 在奇数层，增加到队列头部：
                else{
                    list.addFirst(node.val) ;
                }

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
/*
        // 借助一个队列，通过 BFS 实现按层遍历二叉树
        Queue<TreeNode> queue = new LinkedList<>() ;
        // 申请一个动态数组 ArrayList 动态添加节点值
        List<List<Integer>> ans = new ArrayList<>() ;

        // 根结点先入队
        if(root != null){
            queue.add(root) ;
        }

        while(!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>() ;
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
            if(ans.size() % 2 == 1) {
                Collections.reverse(list) ;
            }
            ans.add(list) ;
        }
        return ans ;*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}