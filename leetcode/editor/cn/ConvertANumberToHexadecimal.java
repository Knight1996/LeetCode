package leetcode.editor.cn;

//给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。 
//
// 注意: 
//
// 
// 十六进制中所有字母(a-f)都必须是小写。 
// 十六进制字符串中不能包含多余的前导零。如果要转化的数为0，那么以单个字符'0'来表示；对于其他情况，十六进制字符串中的第一个字符将不会是0字符。 
// 给定的数确保在32位有符号整数范围内。 
// 不能使用任何由库提供的将数字直接转换或格式化为十六进制的方法。 
// 
//
// 示例 1： 
//
// 
//输入:
//26
//
//输出:
//"1a"
// 
//
// 示例 2： 
//
// 
//输入:
//-1
//
//输出:
//"ffffffff"
// 
// Related Topics 位运算 
// 👍 117 👎 0

public class ConvertANumberToHexadecimal{
    public static void main(String[] args) {
        Solution solution = new ConvertANumberToHexadecimal().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toHex(int num) {
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder str = new StringBuilder();
        while(num != 0){
            // 以 16位 为 一次循环：
            int end = num & 15;
            //比较二进制的差异：
            str.append(hex[end]);
            // 无符号右移 4 位：
            num >>>= 4 ;
        }
        if(str.length() == 0){
            str.append("0");
        }
        //反转字符
        StringBuilder s = str.reverse() ;
        return s.toString() ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}