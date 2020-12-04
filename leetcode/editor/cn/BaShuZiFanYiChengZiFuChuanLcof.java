package leetcode.editor.cn;

//给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可
//能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。 
//
// 
//
// 示例 1: 
//
// 输入: 12258
//输出: 5
//解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi" 
//
// 
//
// 提示： 
//
// 
// 0 <= num < 231 
// 
// 👍 160 👎 0

public class BaShuZiFanYiChengZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZiFanYiChengZiFuChuanLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int translateNum(int num) {
        // 翻译结果数目 = 除去最后一位的翻译结果数目 × 1 + 除去最后二位的翻译结果数目 × 1
        // dp[i] = dp[i - 1] + dp[i - 2] ;
//      ---------------------------------动态规划（数组）----------------------------------
//        String str = String.valueOf(num) ;
//        int len = str.length() ;
//        if(len < 2){
//            return len ;
//        }
//        char[] arr = str.toCharArray() ;
//        int[] dp = new int[len] ;
//        dp[0] = 1 ;
//        for(int i = 1 ; i < len ; i++){
//            dp[i] = dp[i - 1];
//            int cur = 10 * (arr[i - 1] - '0') + (arr[i] - '0');
//            if(cur > 9 && cur < 26){
//                if(i - 2 < 0){
//                    dp[i] ++ ;
//                }
//                else{
//                    dp[i] += dp[i - 2] ;
//                }
//            }
//        }
//        return dp[len - 1] ;
//      -----------------------------------------------------------------------------

//      ------------------------------动态规划（滚动变量--空间优化）-----------------------------
        String str = String.valueOf(num) ;
        int a = 0 , b = 0 , cnt = 1 ;
        for(int i = 0 ; i < str.length() ; i++){
            a = b ;
            b = cnt ;
            cnt = 0 ;
            cnt += b ;
            if(i == 0){
                continue;
            }
            String pre = str.substring(i - 1 , i + 1) ;
            if(pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0){
                cnt += a ;
            }
        }
        return cnt ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}