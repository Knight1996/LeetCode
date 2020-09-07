package leetcode.editor.cn;

//编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。 
// 示例： 
// 输入： a = 1, b = 2
//输出： 2
// 
// Related Topics 位运算 数学 
// 👍 50 👎 0

public class MaximumLcci{
    public static void main(String[] args) {
        Solution solution = new MaximumLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximum(int a, int b) {
        //long 防止溢出
        long m = a ;
        long n = b ;
        int ans = (int)((Math.abs(m - n) + a + b) / 2) ;
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}