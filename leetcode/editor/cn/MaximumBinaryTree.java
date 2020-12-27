package leetcode.editor.cn;

//给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下： 
//
// 
// 二叉树的根是数组中的最大元素。 
// 左子树是通过数组中最大值左边部分构造出的最大二叉树。 
// 右子树是通过数组中最大值右边部分构造出的最大二叉树。 
// 
//
// 通过给定的数组构建最大二叉树，并且输出这个树的根节点。 
//
// 
//
// 示例 ： 
//
// 输入：[3,2,1,6,0,5]
//输出：返回下面这棵树的根节点：
//
//      6
//    /   \
//   3     5
//    \    / 
//     2  0   
//       \
//        1
// 
//
// 
//
// 提示： 
//
// 
// 给定的数组的大小在 [1, 1000] 之间。 
// 
// Related Topics 树 
// 👍 226 👎 0

public class MaximumBinaryTree{
    public static void main(String[] args) {
        Solution solution = new MaximumBinaryTree().new Solution();
        
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums , 0 , nums.length) ;
    }

    public TreeNode construct(int[] nums , int left , int right){
        if(left == right){
            return null ;
        }
        int maxIndex = maxNum(nums, left, right) ;
        TreeNode root = new TreeNode(nums[maxIndex]) ;
        root.left = construct(nums, left, maxIndex) ;
        root.right = construct(nums , maxIndex + 1 , right) ;
        return root ;
    }

    public int maxNum(int[] nums , int left , int right){
        int ans = left ;
        for(int i = left ; i < right ; i++){
            if(nums[ans] < nums[i]){
                ans = i ;
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}