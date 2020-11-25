package leetcode.editor.cn;

//给定一个长度为 n 的整数数组 A 。 
//
// 假设 Bk 是数组 A 顺时针旋转 k 个位置后的数组，我们定义 A 的“旋转函数” F 为： 
//
// F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]。 
//
// 计算F(0), F(1), ..., F(n-1)中的最大值。 
//
// 注意: 
//可以认为 n 的值小于 105。 
//
// 示例: 
//
// 
//A = [4, 3, 2, 6]
//
//F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
//F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
//F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
//F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
//
//所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
// 
// Related Topics 数学 
// 👍 57 👎 0

public class RotateFunction{
    public static void main(String[] args) {
        Solution solution = new RotateFunction().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxRotateFunction(int[] A) {
        //F(k) = F(k - 1) + sum - n*A[len - k]
        int sum = 0, dp1 = 0, dp2 = 0 ;
        int len = A.length ;
        for(int i = 0 ; i < len ; i++){
            sum += A[i];
            dp1 += i * A[i] ;
        }
        int ans = dp1 ;
        for(int i = 1 ; i < len ; i++){
            dp2 = dp1 + sum - len*A[len - i] ;
            ans = Math.max(dp2 , ans) ;
            dp1 = dp2 ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}