package leetcode.editor.cn;

//给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m - 1]
// 。请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘
//积是18。 
//
// 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。 
//
// 
//
// 示例 1： 
//
// 输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1 
//
// 示例 2: 
//
// 输入: 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36 
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 1000 
// 
//
// 注意：本题与主站 343 题相同：https://leetcode-cn.com/problems/integer-break/ 
// Related Topics 数学 动态规划 
// 👍 46 👎 0

public class JianShengZiIiLcof{
    public static void main(String[] args) {
        Solution solution = new JianShengZiIiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int cuttingRope(int n) {
//      ----------------------------动态规划（越界）---------------------------------
        /*if(n < 2){
            return 0 ;
        }
        if(n == 2){
            return 1 ;
        }
        if(n == 3){
            return 2 ;
        }
        //dp[]: 第i（i > 3）个元素表示把长度为i的绳子剪成若干段后各段长度乘机的最大值
        int mod = (int)1000000007 ;
        long[] dp = new long[n + 1];
        dp[0] = 0 ;
        dp[1] = 1 ;
        dp[2] = 2 ;
        dp[3] = 3 ;
        for(int i = 4 ; i <= n ; i++){
            for(int j = 1 ; j <= i / 2 ; j++){
                dp[i] = Math.max(dp[i] , (dp[j] * dp[i - j]) % mod) ;
            }
        }
        return (int)dp[n] ;*/
//      ---------------------------------贪婪算法-----------------------------------
        if(n < 2){
            return 0 ;
        }
        if(n == 2){
            return 1 ;
        }
        if(n == 3){
            return 2 ;
        }
        int mod = (int)1000000007 ;
        long ans = 1 ;
        while(n > 4){
            ans *= 3 ;
            ans %= mod ;
            n -= 3 ;
        }
        return (int)((ans * n )% mod);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}