package leetcode.editor.cn;

//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 示例 1: 
//
// 
//输入: "aba"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "abca"
//输出: True
//解释: 你可以删除c字符。
// 
//
// 注意: 
//
// 
// 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。 
// 
// Related Topics 字符串 
// 👍 303 👎 0

public class ValidPalindromeIi{
    public static void main(String[] args) {
        Solution solution = new ValidPalindromeIi().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
//      ----------------------------------------双指针---------------------------------------
        char[] arr = s.toCharArray() ;
        int len = arr.length ;
        int left = 0 , right = len - 1 ;
        while(left < right){
            if(arr[left] != arr[right]){
                return helper(arr , left + 1 , right) || helper(arr , left , right - 1) ;
            }
            left++ ;
            right-- ;
        }
        return true ;
//      --------------------------------------------------------------------------------------
    }

    public boolean helper(char[] arr , int i , int j){
        while(i < j){
            if(arr[i] != arr[j]){
                return false ;
            }
            i++ ;
            j-- ;
        }
        return true ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}