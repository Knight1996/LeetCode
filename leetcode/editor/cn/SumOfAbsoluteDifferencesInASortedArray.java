package leetcode.editor.cn;

//给你一个 非递减 有序整数数组 nums 。 
//
// 请你建立并返回一个整数数组 result，它跟 nums 长度相同，且result[i] 等于 nums[i] 与数组中所有其他元素差的绝对值之和。 
//
// 换句话说， result[i] 等于 sum(|nums[i]-nums[j]|) ，其中 0 <= j < nums.length 且 j != i （
//下标从 0 开始）。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,3,5]
//输出：[4,3,5]
//解释：假设数组下标从 0 开始，那么
//result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4，
//result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3，
//result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,4,6,8,10]
//输出：[24,15,13,15,21]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 105 
// 1 <= nums[i] <= nums[i + 1] <= 104 
// 
// Related Topics 贪心算法 数学 
// 👍 8 👎 0

public class SumOfAbsoluteDifferencesInASortedArray{
    public static void main(String[] args) {
        Solution solution = new SumOfAbsoluteDifferencesInASortedArray().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
//      -----------------------------------前缀和 + 数学公式-----------------------------------------------
        // 后面 n - i 绝对值差的和：
        // (nums[n - 1] - nums[i]) + (nums[n - 2] - nums[i]) + ... + (nums[i] - nums[i])
        //  = (nums[i] + ... + nums[n - 1]) - (nums[i] + ... + nums[i])
        //  = dp[n - 1] - dp[i - 1] - (len - i) * nums[i]
        //
        // (nums[i] - nums[0]) + (nums[i] - nums[1]) + ... + (nums[i] - nums[i - 1])
        // (nums[i] + ... + nums[i]) - (nums[0] + ... + nums[i - 1])
        //  = i * nums[i] - dp[i - 1]
        //  ans[i] = dp[n - 1] - 2 * dp[i - 1] - (n - 2 * i) * nums[i]。

        int len = nums.length;
        int[] dp = new int[len] ;     // 前缀和数组
        int[] ans = new int[len] ;    // 答案数组
        dp[0] = nums[0];

        for(int i = 1 ; i < len ; i++){
            dp[i] += dp[i - 1] + nums[i];
        }

        ans[0] = dp[len - 1] - len * nums[0] ;
        for(int i = 1 ; i < len ; i++){
            // 推导公式 ：
            ans[i] = dp[len - 1] - 2 * dp[i - 1] - (len - 2 * i) * nums[i];
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}