package leetcode.editor.cn;

//实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数
//问题。 
//
// 
//
// 示例 1: 
//
// 输入: 2.00000, 10
//输出: 1024.00000
// 
//
// 示例 2: 
//
// 输入: 2.10000, 3
//输出: 9.26100
// 
//
// 示例 3: 
//
// 输入: 2.00000, -2
//输出: 0.25000
//解释: 2-2 = 1/22 = 1/4 = 0.25 
//
// 
//
// 说明: 
//
// 
// -100.0 < x < 100.0 
// n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。 
// 
//
// 注意：本题与主站 50 题相同：https://leetcode-cn.com/problems/powx-n/ 
// Related Topics 递归 
// 👍 87 👎 0

public class ShuZhiDeZhengShuCiFangLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZhiDeZhengShuCiFangLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double myPow(double x, int n) {
//      ------------------------------快速幂（分情况讨论）---------------------------------
        /*if(x == 0){
            return 0 ;
        }
        long num = n ;
        double ans = 1.0 ;
        //幂次小于0 ，底数变为-1次方，幂数变为正数；
        if(num < 0){
            x = 1 / x ;
            num = - num ;
        }

        while(num > 0){
            if((num & 1) == 1){
                ans *= x ;
            }
            x *= x ;
            num >>= 1 ;
        }
        return ans ;*/
//      --------------------------------递归--------------------------------
        if(n == 0){
            return 1 ;
        }
        if(n < 0){
            return 1 / x * myPow(1 / x , - n - 1) ;
        }
        return (n % 2 == 0) ? myPow(x * x , n / 2) : x * myPow(x * x , n / 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}