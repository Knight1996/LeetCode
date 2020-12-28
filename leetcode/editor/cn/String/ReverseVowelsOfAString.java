package leetcode.editor.cn;

//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。 
//
// 
//
// 示例 1： 
//
// 输入："hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 输入："leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 元音字母不包含字母 "y" 。 
// 
// Related Topics 双指针 字符串 
// 👍 120 👎 0

public class ReverseVowelsOfAString{
    public static void main(String[] args) {
        Solution solution = new ReverseVowelsOfAString().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        int i = 0 ;
        int j = s.length() - 1 ;

        char[] chars = s.toCharArray();
        while(i < j){
            while(i < j && !isVowels(chars[i])){
                i++;
            }
            while(i < j && !isVowels(chars[j])){
                j--;
            }
            if(i < j){
                char tem = chars[i];
                chars[i] = chars[j];
                chars[j] = tem;
                i++;
                j--;
            }
        }
        return new String(chars) ;
    }

    boolean isVowels(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true ;
        }
        return false ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}