package leetcode.editor.cn;

//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。 
//
// 
//
// 参考以下这颗二叉搜索树： 
//
//      5
//    / \
//   2   6
//  / \
// 1   3 
//
// 示例 1： 
//
// 输入: [1,6,3,2,5]
//输出: false 
//
// 示例 2： 
//
// 输入: [1,3,2,6,5]
//输出: true 
//
// 
//
// 提示： 
//
// 
// 数组长度 <= 1000 
// 
// 👍 139 👎 0

import java.util.Stack;

public class ErChaSouSuoShuDeHouXuBianLiXuLieLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuDeHouXuBianLiXuLieLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean verifyPostorder(int[] postorder) {
//      --------------------------递归分治-------------------------------
        return helper(postorder , 0 , postorder.length - 1) ;
//      ---------------------------单调栈-------------------------------
        /*Stack<Integer> stack = new Stack<>() ;
        int root = Integer.MAX_VALUE ;
        for(int i = postorder.length - 1 ; i >= 0 ; i--){
            if(postorder[i] > root){
                return false ;
            }
            while(!stack.isEmpty() && stack.peek() > postorder[i]){
                root = stack.pop() ;
            }
            stack.add(postorder[i]);
        }
        return true ;*/
    }

    public boolean helper(int[] arr , int start , int end){
        // start == end : 就一个节点
        // start > end :  没有节点
        if(start >= end){
            return true ;
        }
        int index = start ;
        while(arr[index] < arr[end]){
            index++ ;
        }
        int mid = index ;
        while(arr[index] > arr[end]){
            index++ ;
        }
        return index == end &&
                helper(arr , start , mid - 1) &&
                helper(arr , mid , end - 1) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}