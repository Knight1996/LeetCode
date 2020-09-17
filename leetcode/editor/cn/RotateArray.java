package leetcode.editor.cn;

//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。 
//
// 示例 1: 
//
// 输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
// 
//
// 示例 2: 
//
// 输入: [-1,-100,3,99] 和 k = 2
//输出: [3,99,-1,-100]
//解释: 
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100] 
//
// 说明: 
//
// 
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。 
// 要求使用空间复杂度为 O(1) 的 原地 算法。 
// 
// Related Topics 数组 
// 👍 690 👎 0

public class RotateArray{
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
//     ---------------------------------- 暴力 -----------------------------------
        /*int tem , pre = 0 ;
        for(int i = 0 ; i < k ; i++){
            pre = nums[nums.length - 1] ;
            for(int j = 0 ; j < nums.length ; j++){
                tem = nums[j] ;
                nums[j] = pre ;
                pre = tem ;
            }
        }*/
//     ----------------------------------------------------------------------------

//     ---------------------------- 使用额外的数组 ---------------------------------
        int[] ans = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; i++){
            ans[(i + k) % nums.length] = nums[i] ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = ans[i] ;
        }
//     -------------------------------------------------------------------------------

//     ------------------------------ 使用环状替换 ------------------------------------
       /* k = k % nums.length ;
        int cnt = 0 ;
        for(int start = 0 ; cnt < nums.length ; start++){
            int cur = start ;
            int pre = nums[start] ;
            do{
                int next = (cur + k) % nums.length ;
                int tem = nums[next] ;
                nums[next] = pre ;
                pre = tem ;
                cur = next ;
                cnt ++ ;
            } while(start != cur) ;
        }*/
//     -------------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}