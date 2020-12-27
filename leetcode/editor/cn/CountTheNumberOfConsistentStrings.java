package leetcode.editor.cn;

//给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字
//符串 。 
//
// 请你返回 words 数组中 一致字符串 的数目。 
//
// 
//
// 示例 1： 
//
// 
//输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//输出：2
//解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
// 
//
// 示例 2： 
//
// 
//输入：allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
//输出：7
//解释：所有字符串都是一致的。
// 
//
// 示例 3： 
//
// 
//输入：allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
//输出：4
//解释：字符串 "cc"，"acd"，"ac" 和 "d" 是一致字符串。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 104 
// 1 <= allowed.length <= 26 
// 1 <= words[i].length <= 10 
// allowed 中的字符 互不相同 。 
// words[i] 和 allowed 只包含小写英文字母。 
// 
// Related Topics 字符串 
// 👍 3 👎 0

import java.util.ArrayList;
import java.util.List;

public class CountTheNumberOfConsistentStrings{
    public static void main(String[] args) {
        Solution solution = new CountTheNumberOfConsistentStrings().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
//      ---------------------------------------暴力 + 模拟--------------------------------------------------
        char[] arr = allowed.toCharArray() ;
        List<Character> list = new ArrayList<>() ;
        for(char c : arr){
            list.add(c);
        }

        // 统计 字符串数组中 包含 不在allowed字符串中字符 的 字符串的数量：
        int cnt = 0 ;
        for(String str : words){
            char[] tem = str.toCharArray();
            for (char c : tem){
                if(!list.contains(c)){
                    cnt++ ;
                    break ;
                }
            }
        }
        return words.length - cnt ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}