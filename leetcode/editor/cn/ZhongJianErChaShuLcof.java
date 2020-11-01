package leetcode.editor.cn;

//输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 例如，给出 
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
// Related Topics 树 递归 
// 👍 229 👎 0

import java.util.Arrays;

public class ZhongJianErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();
        
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
//      -----------------------------写法一--------------------------------------
        if(preorder == null || preorder.length == 0){
            return null ;
        }

        TreeNode node = null ;

        for(int i = 0 ; i < inorder.length ; i++){
            if(preorder[0] == inorder[i]){
                node = new TreeNode(preorder[0]) ;
                node.left = buildTree(Arrays.copyOfRange(preorder , 1 , i + 1) , Arrays.copyOfRange(inorder , 0 , i)) ;
                node.right = buildTree(Arrays.copyOfRange(preorder , i + 1 , preorder.length) , Arrays.copyOfRange(inorder , i + 1 , inorder.length)) ;
            }
        }
        return node ;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}