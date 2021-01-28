package leetcode.editor.cn;

//设计一个函数把两个数字相加。不得使用 + 或者其他算术运算符。 
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
// Related Topics 位运算 
// 👍 27 👎 0

public class AddWithoutPlusLcci{
    public static void main(String[] args) {
        Solution solution = new AddWithoutPlusLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int add(int a, int b) {
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