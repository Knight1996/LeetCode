package leetcode.editor.cn;

//给定一个 N 叉树，找到其最大深度。 
//
// 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 我们应返回其最大深度，3。 
//
// 说明: 
//
// 
// 树的深度不会超过 1000。 
// 树的节点总不会超过 5000。 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 117 👎 0

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNAryTree{
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfNAryTree().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
//    ------------------------------------DFS 递归 ---------------------------------------
        /*if(root == null){
            return 0 ;
        }
        int ans = 0 ;
        for(Node subNode : root.children){
            int tem = maxDepth(subNode) ;
            ans = Math.max(tem , ans) ;
        }
        return ans + 1 ;*/
//      -------------------------------------------------------------------------------

//      ----------------------------------BFS 迭代 -------------------------------------
        if(root == null){
            return 0 ;
        }
        int layer = 0 ;
        Queue<Node> queue = new LinkedList<>() ;
        queue.offer(root) ;
        while(!queue.isEmpty()){
            layer++;
            int size = queue.size() ;
            for(int i = 0 ; i < size ; i++){
                Node cur = queue.poll() ;
                for(Node subNode : cur.children){
                    if(subNode != null){
                        queue.offer(subNode) ;
                    }
                }
            }
        }
        return layer ;
//      ---------------------------------------------------------------------------------

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}