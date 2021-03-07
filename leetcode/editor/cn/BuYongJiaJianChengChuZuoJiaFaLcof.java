package leetcode.editor.cn;

//写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。 
//
// 
//
// 示例: 
//
// 输入: a = 1, b = 1
//输出: 2 
//
// 
//
// 提示： 
//
// 
// a, b 均可能是负数或 0 
// 结果不会溢出 32 位整数 
// 
// 👍 85 👎 0

public class BuYongJiaJianChengChuZuoJiaFaLcof{
    public static void main(String[] args) {
        Solution solution = new BuYongJiaJianChengChuZuoJiaFaLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int add(int a, int b) {
//      ----------------------------位运算(循环)---------------------------------
        while(b != 0){
            int c = (a & b) << 1 ;  // 计算进位 c ：     与运算后左移一位
            a ^= b ;                // 计算无进位的和 ：  异或运算
            b = c ;                 // 相加操作：         重复之前操作，
                                    // 循环退出条件：     进位为 0
        }
        return a ;
//      ----------------------------位运算(递归)------------------------------
//        if (b == 0) {
//            return a;
//        }else{
//            return add(a ^ b, (a & b) << 1);
//        }
    }

    /*//  -------------------------位运算实现减法---------------------
    //  利用加法：
    public int sub(int a , int b){
        // a - b = a + (-b)
        // -b:不能使用减号，  -b = add(~b , 1) ; 二进制表达式取反加一
        return add(a , add(~b , 1)) ;
    }

    //  -------------------------位运算实现乘法---------------------
    public int mul(int a , int b){
//      --------------------------利用加法--------------------------
        int ans = 0 ;
        while(b > 0){
            ans = add(a , ans) ;
            b-- ;
        }
        return ans ;

//      ---------------------------位运算----------------------------
        // a*b = sum(a*2^i*b(i))   0 <= i <= 31  b(i) == 0或1 ;
        int ans = 0 ;
        while(b != 0){
            if((b & 1) != 0){
                ans = add(ans , a) ;
            }
            a <<= 1 ;
            b >>>= 1 ;
        }
        return ans ;
    }

    //  -------------------------位运算实现除法---------------------
    public int div(int a , int b){
//      --------------------------利用减法--------------------------
        if(a < b){
            return 0 ;
        }
        int ans = 0 ;
        do {
            a = sub(a, b);
            ans++;
        } while (a >= b);
        return ans ;
//      ---------------------------位运算---------------------------
        if(b == 0){
            throw new RuntimeException("Divisor Is 0") ;
        }
        if(a == Integer.MIN_VALUE && b == Integer.MIN_VALUE){
            return 1 ;
        }
        else if(b == Integer.MIN_VALUE){
            return 0 ;
        }
        else if(a == Integer.MIN_VALUE){
            int ans = div(add(a , 1) , b) ;
            return add(ans , div(sub(a , mul(ans , b)) , b)) ;
        }
        else{
            return div(a , b) ;
        }
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}