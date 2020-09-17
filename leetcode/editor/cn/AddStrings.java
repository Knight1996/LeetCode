package leetcode.editor.cn;

//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。 
//
// 
//
// 提示： 
//
// 
// num1 和num2 的长度都小于 5100 
// num1 和num2 都只包含数字 0-9 
// num1 和num2 都不包含任何前导零 
// 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式 
// 
// Related Topics 字符串 
// 👍 259 👎 0

public class AddStrings{
    public static void main(String[] args) {
        Solution solution = new AddStrings().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1 ;
        int j = num2.length() - 1 ;
        int add = 0 ;
        StringBuffer str = new StringBuffer() ;
        while(i >= 0 || j >= 0 || add != 0){
            int x = 0 , y = 0 ;
            if(i >= 0){
                x = num1.charAt(i) - '0' ;
            }
            if(j >= 0){
                y = num2.charAt(j) - '0' ;
            }
            int tem = x + y + add ;
            str.append(tem % 10);
            add = tem / 10 ;
            i--;
            j--;
        }
        return str.reverse().toString() ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}