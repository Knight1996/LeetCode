package leetcode.editor.cn;

//我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。 
//
// 
//
// 示例: 
//
// 输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。 
//
// 说明: 
//
// 
// 1 是丑数。 
// n 不超过1690。 
// 
//
// 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/ 
// Related Topics 数学 
// 👍 72 👎 0

public class ChouShuLcof{
    public static void main(String[] args) {
        Solution solution = new ChouShuLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nthUglyNumber(int n) {
        int cnt2 = 0 , cnt3 = 0 , cnt5 = 0 ;
        int[] dp = new int[n] ;
        dp[0] = 1 ;
        for(int i = 1 ; i < n ; i++){
            int n2 = dp[cnt2] * 2 , n3 = dp[cnt3] * 3 , n5 = dp[cnt5] * 5 ;
            dp[i] = Math.min(Math.min(n2 , n3) , n5) ;
            if(dp[i] == n2){
                cnt2++ ;
            }
            if(dp[i] == n3){
                cnt3++ ;
            }
            if(dp[i] == n5){
                cnt5++ ;
            }
        }
        return dp[n - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}