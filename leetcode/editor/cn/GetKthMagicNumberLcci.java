package leetcode.editor.cn;

//有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。例如，前几个数按顺序应该是 1，3，
//5，7，9，15，21。 
//
// 示例 1: 
//
// 输入: k = 5
//
//输出: 9
// 
// Related Topics 堆 队列 数学 
// 👍 39 👎 0

public class GetKthMagicNumberLcci{
    public static void main(String[] args) {
        Solution solution = new GetKthMagicNumberLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getKthMagicNumber(int k) {
//      --------------------------------动态规划-------------------------------------------
        int cnt3 = 0 , cnt5 = 0 , cnt7 = 0 ;
        int[] dp = new int[k] ;
        dp[0] = 1 ;
        for(int i = 1 ; i < k ; i++){
            // 选出最小数字：
            dp[i] = Math.min(dp[cnt3] * 3 , Math.min(dp[cnt5] * 5 , dp[cnt7] * 7)) ;
            // 指针向前移动：
            if(dp[i] == dp[cnt3] * 3){
                cnt3++ ;
            }
            if(dp[i] == dp[cnt5] * 5){
                cnt5++ ;
            }
            if(dp[i] == dp[cnt7] * 7){
                cnt7++ ;
            }
        }
        return dp[k - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}