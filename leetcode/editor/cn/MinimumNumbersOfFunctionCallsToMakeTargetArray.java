package leetcode.editor.cn;

//
//
// 给你一个与 nums 大小相同且初始值全为 0 的数组 arr ，请你调用以上函数得到整数数组 nums 。 
//
// 请你返回将 arr 变成 nums 的最少函数调用次数。 
//
// 答案保证在 32 位有符号整数以内。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,5]
//输出：5
//解释：给第二个数加 1 ：[0, 0] 变成 [0, 1] （1 次操作）。
//将所有数字乘以 2 ：[0, 1] -> [0, 2] -> [0, 4] （2 次操作）。
//给两个数字都加 1 ：[0, 4] -> [1, 4] -> [1, 5] （2 次操作）。
//总操作次数为：1 + 2 + 2 = 5 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,2]
//输出：3
//解释：给两个数字都加 1 ：[0, 0] -> [0, 1] -> [1, 1] （2 次操作）。
//将所有数字乘以 2 ： [1, 1] -> [2, 2] （1 次操作）。
//总操作次数为： 2 + 1 = 3 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [4,2,5]
//输出：6
//解释：（初始）[0,0,0] -> [1,0,0] -> [1,0,1] -> [2,0,2] -> [2,1,2] -> [4,2,4] -> [4,2,
//5] （nums 数组）。
// 
//
// 示例 4： 
//
// 
//输入：nums = [3,2,2,4]
//输出：7
// 
//
// 示例 5： 
//
// 
//输入：nums = [2,4,8,16]
//输出：8
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10^5 
// 0 <= nums[i] <= 10^9 
// 
// Related Topics 贪心算法 
// 👍 11 👎 0

public class MinimumNumbersOfFunctionCallsToMakeTargetArray{
    public static void main(String[] args) {
        Solution solution = new MinimumNumbersOfFunctionCallsToMakeTargetArray().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(int[] nums) {
//      ---------------------------------贪心--------------------------------
        // 操作一：单个数减一:
        // 操作二：所有数乘2:（前提： 所有数为偶数）
        //
        // 策略：先将奇数减一，变为偶数，后除以2，直至全部为零：
        int ans = 0 , maxNum = 0 ;
        for(int num : nums){
            maxNum = Math.max(num , maxNum) ;
            // 第一种操作的次数等于它的二进制表示中的 11 的数量:
            while(num != 0){
                if((num & 1) == 1){
                    ans++ ;
                }
                num >>= 1 ;
            }
        }
        // 只考虑 最大数 maxNum 的第二种操作即可：
        // 如果最大数为 0 , 则不用减 1 ；
        if(maxNum > 0){
            while(maxNum > 0){
                ans++ ;
                maxNum >>= 1 ;
            }
            ans-- ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}