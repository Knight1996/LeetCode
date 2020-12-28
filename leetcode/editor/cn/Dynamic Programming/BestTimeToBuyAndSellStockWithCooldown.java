package leetcode.editor.cn;

//给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。 
//
// 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）: 
//
// 
// 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。 
// 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。 
// 
//
// 示例: 
//
// 输入: [1,2,3,0,2]
//输出: 3 
//解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出] 
// Related Topics 动态规划 
// 👍 646 👎 0

public class BestTimeToBuyAndSellStockWithCooldown{
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStockWithCooldown().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0 ;
        }
        int len = prices.length;
        int[][] dp = new int[len][3] ;
        // dp[i][0] :手上持有股票的最大收益：
        // dp[i][1] :手上不持有股票，并且处于 冷冻期 中的 累计最大收益
        // dp[i][2]: 手上不持有股票，并且不在 冷冻期 中的 累计最大收益
        dp[0][0] = -prices[0] ; // 边界条件：
        for(int i = 1 ; i < len ; i++){
            // 状态转移方程：
            dp[i][0] = Math.max(dp[i - 1][0] , dp[i - 1][2] - prices[i]) ;
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][2] , dp[i - 1][1]) ;
        }
        return Math.max(dp[len - 1][1], dp[len - 1][2]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}