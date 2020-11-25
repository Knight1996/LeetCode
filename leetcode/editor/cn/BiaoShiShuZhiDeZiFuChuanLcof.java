package leetcode.editor.cn;

//请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"-1E-16"、"012
//3"都表示数值，但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是。 
//
// 
// Related Topics 数学 
// 👍 121 👎 0

public class BiaoShiShuZhiDeZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new BiaoShiShuZhiDeZiFuChuanLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int index = 0 ;  //全局索引,相当于C++的指针

    public boolean isNumber(String s) {
        if(s.length() == 0 || s == null){
            return false ;
        }
        //  '$'  结束标志
        s = s + '$' ;
        // 跳过开始的空格
        while(s.charAt(index) == ' '){
            index++ ;
        }
        // 判断是否有整数部分：
        boolean judge = hasInteger(s) ;
        // 判断是否有小数部分：
        if(s.charAt(index) == '.'){
            index++ ;
            judge = hasUnsignedInteger(s) || judge ;
            // || 短路运算符，只要 小数点 一边有数字就可以
        }
        // 判断是否有指数部分：
        if(s.charAt(index) == 'e' || s.charAt(index) == 'E'){
            index++ ;
            judge = judge && hasInteger(s);
            // && 短路运算符， E 或 e 两边都要有数字
        }
        // 跳过尾部空格：
        while(s.charAt(index) == ' '){
            index++ ;
        }
        return judge && s.charAt(index) == '$' ;
    }

    // 字符串是否包含无符号数：
    public boolean hasUnsignedInteger(String str){
        int flag = index ;
        while(str.charAt(index) >= '0' && str.charAt(index) <= '9'){
            index++ ;
        }
        return index > flag ;
    }

    public boolean hasInteger(String str){
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
             index++ ;
        }
        return hasUnsignedInteger(str) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}