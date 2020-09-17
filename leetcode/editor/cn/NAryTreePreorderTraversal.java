package leetcode.editor.cn;

//给定一个 N 叉树，返回其节点值的前序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 101 👎 0

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NAryTreePreorderTraversal{
    public static void main(String[] args) {
        Solution solution = new NAryTreePreorderTraversal().new Solution();
        
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

    public List<Integer> preorder(Node root) {
//     ----------------------------------递归----------------------------------------
        /*List<Integer> res = new ArrayList<>() ;
        if(root == null){
            return res ;
        }
        dfs(root , res) ;
        return res ;*/
//     -------------------------------------------------------------------------------

//     ----------------------------------迭代------------------------------------------
        LinkedList<Node> stack = new LinkedList<Node>() ;
        LinkedList<Integer> ans = new LinkedList<Integer>() ;
        if(root == null){
            return ans ;
        }
        stack.add(root) ;
        while(!stack.isEmpty()){
            Node node = stack.pollLast() ;
            ans.add(node.val) ;
            Collections.reverse(node.children);
            for(Node item : node.children){
                stack.add(item) ;
            }
        }
        return ans ;
    }

    /*public void dfs(Node root , List<Integer> res){
        if(root == null){
            return ;
        }
        res.add(root.val) ;
        for(Node child : root.children){
            dfs(child , res) ;
        }
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}