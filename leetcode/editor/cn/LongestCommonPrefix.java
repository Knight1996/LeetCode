package leetcode.editor.cn;

//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串 
// 👍 1246 👎 0

public class LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        int len = strs[0].length();
        int cnt = strs.length;
        for(int i = 0 ; i < len ; i++){
            char c = strs[0].charAt(i) ;
            for(int j = 1 ; j < cnt ; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0 , i);
                }
            }
        }

        return strs[0] ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}