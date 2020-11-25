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
//      ----------------------------位运算---------------------------------
        while(b != 0){
            int c = (a & b) << 1 ;  // 计算进位 c ：     与运算后左移一位
            a ^= b ;                // 计算无进位的和 ：  异或运算
            b = c ;                 // 相加操作：         重复之前操作，
                                    // 循环退出条件：     进位为 0
        }
        return a ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}