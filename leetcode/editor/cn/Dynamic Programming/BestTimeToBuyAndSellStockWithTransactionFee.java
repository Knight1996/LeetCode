package leetcode.editor.cn;

//给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。 
//
// 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。 
//
// 返回获得利润的最大值。 
//
// 注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。 
//
// 示例 1: 
//
// 输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
//输出: 8
//解释: 能够达到的最大利润:  
//在此处买入 prices[0] = 1
//在此处卖出 prices[3] = 8
//在此处买入 prices[4] = 4
//在此处卖出 prices[5] = 9
//总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8. 
//
// 注意: 
//
// 
// 0 < prices.length <= 50000. 
// 0 < prices[i] < 50000. 
// 0 <= fee < 50000. 
// 
// Related Topics 贪心算法 数组 动态规划 
// 👍 393 👎 0

public class BestTimeToBuyAndSellStockWithTransactionFee{
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStockWithTransactionFee().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices, int fee) {
//      ------------------------------------动态规划--------------------------------------
//      dp[i][0] 表示第 i 天交易完后手里没有股票的最大利润，
//      dp[i][1]dp[i][1] 表示第 i 天交易完后手里持有一支股票的最大利润（ i 从 00 开始）
        int len = prices.length ;
        int[][] dp = new int[len][2] ;
        dp[0][0] = 0 ;
        dp[0][1] = -prices[0] ; // 第一天买入：
        for(int i = 1 ; i < len ; i++){
            dp[i][0] = Math.max(dp[i - 1][0] , dp[i - 1][1] + prices[i] - fee) ;
            dp[i][1] = Math.max(dp[i - 1][1] , dp[i - 1][0] - prices[i]) ;
        }
        return dp[len - 1][0] ;
//      ---------------------------------------------------------------------------------

//      --------------------------------------贪心----------------------------------------
//        int profit = 0 , input = prices[0] + fee ;
//        for(int i = 1 ; i < prices.length ; i++){
//            if(prices[i] + fee < input){
//                input = prices[i] + fee ;
//            }
//            // 只要有收益就卖出，但不一定是全局最优：
//            else if(input < prices[i]){
//                profit += prices[i] - input ;
//                // 如果明天比今天高，就加上这个差值，变成全局最优
//                input = prices[i];
//            }
//        }
//        return profit ;
//      -----------------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}