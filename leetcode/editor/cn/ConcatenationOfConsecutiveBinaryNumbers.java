package leetcode.editor.cn;

//给你一个整数 n ，请你将 1 到 n 的二进制表示连接起来，并返回连接结果对应的 十进制 数字对 109 + 7 取余的结果。 
//
// 
//
// 示例 1： 
//
// 输入：n = 1
//输出：1
//解释：二进制的 "1" 对应着十进制的 1 。
// 
//
// 示例 2： 
//
// 输入：n = 3
//输出：27
//解释：二进制下，1，2 和 3 分别对应 "1" ，"10" 和 "11" 。
//将它们依次连接，我们得到 "11011" ，对应着十进制的 27 。
// 
//
// 示例 3： 
//
// 输入：n = 12
//输出：505379714
//解释：连接结果为 "1101110010111011110001001101010111100" 。
//对应的十进制数字为 118505380540 。
//对 109 + 7 取余后，结果为 505379714 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 105 
// 
// Related Topics 数学 
// 👍 12 👎 0

public class ConcatenationOfConsecutiveBinaryNumbers{
    public static void main(String[] args) {
        Solution solution = new ConcatenationOfConsecutiveBinaryNumbers().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int concatenatedBinary(int n) {
//      -------------------------------------模拟------------------------------------------
        // 拼接的结果无非是 res 二进制向左移 shift 位得到的 值 与 所拼接二进制字符串值 的 和 :
        int ans = 0 , shift = 0 ;
        for(int i = 1 ; i <= n ; i++){
            // 此数为 2 的幂，进位
            if((i & (i - 1)) == 0){
                shift++ ;
            }
            ans = (int)((((long)ans << shift) + i) % (1000000007)) ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}