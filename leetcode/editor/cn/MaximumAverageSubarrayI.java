package leetcode.editor.cn;

//给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。 
//
// 示例 1: 
//
// 输入: [1,12,-5,-6,50,3], k = 4
//输出: 12.75
//解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
// 
//
// 
//
// 注意: 
//
// 
// 1 <= k <= n <= 30,000。 
// 所给数据范围 [-10,000，10,000]。 
// 
// Related Topics 数组 
// 👍 108 👎 0

public class MaximumAverageSubarrayI{
    public static void main(String[] args) {
        Solution solution = new MaximumAverageSubarrayI().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //滑动窗口：
        double sum = 0 ;

        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }

        double ans = sum ;
        for(int i = k ; i < nums.length ; i++){
            sum += nums[i] - nums[i - k];
            ans = Math.max(ans , sum);
        }

        return ans / k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}