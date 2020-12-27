package leetcode.editor.cn;

//给定一个由 '(' 和 ')' 括号组成的字符串 S，我们需要添加最少的括号（ '(' 或是 ')'，可以在任何位置），以使得到的括号字符串有效。 
//
// 从形式上讲，只有满足下面几点之一，括号字符串才是有效的： 
//
// 
// 它是一个空字符串，或者 
// 它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者 
// 它可以被写作 (A)，其中 A 是有效字符串。 
// 
//
// 给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数。 
//
// 
//
// 示例 1： 
//
// 输入："())"
//输出：1
// 
//
// 示例 2： 
//
// 输入："((("
//输出：3
// 
//
// 示例 3： 
//
// 输入："()"
//输出：0
// 
//
// 示例 4： 
//
// 输入："()))(("
//输出：4 
//
// 
//
// 提示： 
//
// 
// S.length <= 1000 
// S 只包含 '(' 和 ')' 字符。 
// 
//
// 
// Related Topics 栈 贪心算法 
// 👍 73 👎 0

public class MinimumAddToMakeParenthesesValid{
    public static void main(String[] args) {
        Solution solution = new MinimumAddToMakeParenthesesValid().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minAddToMakeValid(String S) {
//      ------------------------------------ 平衡法 -------------------------------------
        int ans = 0 , bal = 0 ;
        for(int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i) == '('){
                bal++ ;
            }
            else{
                bal-- ;
            }
            // 如果为负数，结尾加上一个 ")" ，
            // ans++(结果加一），  bal++(恢复平衡)
            if(bal == -1){
                ans++ ;
                bal++ ;
            }
        }
        // ans:结尾加 "(" 的数量
        // bal:开头加 ")" 的数量
        return ans + bal ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}