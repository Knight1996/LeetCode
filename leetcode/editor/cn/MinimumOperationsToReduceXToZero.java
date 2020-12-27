package leetcode.editor.cn;

//给你一个整数数组 nums 和一个整数 x 。每一次操作时，你应当移除数组 nums 最左边或最右边的元素，然后从 x 中减去该元素的值。请注意，需要 修改
// 数组以供接下来的操作使用。 
//
// 如果可以将 x 恰好 减到 0 ，返回 最小操作数 ；否则，返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,4,2,3], x = 5
//输出：2
//解释：最佳解决方案是移除后两个元素，将 x 减到 0 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [5,6,7,8,9], x = 4
//输出：-1
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,2,20,1,1,3], x = 10
//输出：5
//解释：最佳解决方案是移除后三个元素和前两个元素（总共 5 次操作），将 x 减到 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 105 
// 1 <= nums[i] <= 104 
// 1 <= x <= 109 
// 
// Related Topics 贪心算法 双指针 二分查找 
// 👍 28 👎 0

public class MinimumOperationsToReduceXToZero{
    public static void main(String[] args) {
        Solution solution = new MinimumOperationsToReduceXToZero().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(int[] nums, int x) {
//      ----------------------------------------滑动窗口---------------------------------------------
        // 判断从 nums 两头减数字能否等于 x,
        // 相当于判断数组 nums 是否有子数组和恰好等于数组总和 sum-x ，并求取最大长度。
        // 用双指针或者滑动窗口遍历数组计算最长和为 sum-x 的 子数组长度
        int len = nums.length;

        int sum = 0 ;
        for(int i = 0 ; i < len ; i++){
            sum += nums[i];
        }

        int target = sum - x ;
        if(target == 0){
            return len ;
        }
        else if(target < 0){
            return -1 ;
        }

        int left = 0 , right = 0 ;  // left 与 right 为 滑动窗口指针
        int tem = 0 , ans = -1 ;

        while(right < len){
            tem += nums[right++];
            while(tem > target && left < right){
                tem -= nums[left++] ;
            }
            if(tem == target){
                ans = Math.max(ans , right - left);
            }
        }
        return ans == -1 ? ans : (len - ans) ;
//      -----------------------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}