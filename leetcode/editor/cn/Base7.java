package leetcode.editor.cn;

//给定一个整数，将其转化为7进制，并以字符串形式输出。 
//
// 示例 1: 
//
// 
//输入: 100
//输出: "202"
// 
//
// 示例 2: 
//
// 
//输入: -7
//输出: "-10"
// 
//
// 注意: 输入范围是 [-1e7, 1e7] 。 
// 👍 56 👎 0

public class Base7{
    public static void main(String[] args) {
        Solution solution = new Base7().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        StringBuffer s = new StringBuffer() ;
        boolean flag = false ;
        if(num < 0){
            flag = true ;
            num = -num ;
        }
        while(num >= 7){
            int tem = num % 7 ;
            num /= 7 ;
            s.append(tem);
        }
        s.append(num);
        if(flag == true){
            s.append("-");
        }
        s.reverse();
        return s.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}