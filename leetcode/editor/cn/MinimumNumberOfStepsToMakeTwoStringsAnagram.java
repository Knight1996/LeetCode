package leetcode.editor.cn;

//给你两个长度相等的字符串 s 和 t。每一个步骤中，你可以选择将 t 中的 任一字符 替换为 另一个字符。 
//
// 返回使 t 成为 s 的字母异位词的最小步骤数。 
//
// 字母异位词 指字母相同，但排列不同（也可能相同）的字符串。 
//
// 
//
// 示例 1： 
//
// 输出：s = "bab", t = "aba"
//输出：1
//提示：用 'b' 替换 t 中的第一个 'a'，t = "bba" 是 s 的一个字母异位词。
// 
//
// 示例 2： 
//
// 输出：s = "leetcode", t = "practice"
//输出：5
//提示：用合适的字符替换 t 中的 'p', 'r', 'a', 'i' 和 'c'，使 t 变成 s 的字母异位词。
// 
//
// 示例 3： 
//
// 输出：s = "anagram", t = "mangaar"
//输出：0
//提示："anagram" 和 "mangaar" 本身就是一组字母异位词。 
// 
//
// 示例 4： 
//
// 输出：s = "xxyyzz", t = "xxyyzz"
//输出：0
// 
//
// 示例 5： 
//
// 输出：s = "friend", t = "family"
//输出：4
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 50000 
// s.length == t.length 
// s 和 t 只包含小写英文字母 
// 
// Related Topics 字符串 
// 👍 23 👎 0

public class MinimumNumberOfStepsToMakeTwoStringsAnagram{
    public static void main(String[] args) {
        Solution solution = new MinimumNumberOfStepsToMakeTwoStringsAnagram().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSteps(String s, String t) {
//      ----------------------------数组记录差值-----------------------------
        // 在 s 中出现的字符c1 : cnts[c1]++ ;
        // 在 t 中出现的字符c2 : cnts[c2]-- ;
        // cnts 中各项之和为 0 ;
        // cnts 中所有正数之和为结果：
        int len = s.length() ;
        int[] cnts = new int[26] ;
        for(int i = 0 ; i < len ; i++){
            char c1 = s.charAt(i) ;
            char c2 = t.charAt(i) ;
            cnts[c1 - 'a']++ ;
            cnts[c2 - 'a']-- ;
        }

        int ans = 0 ;
        for(int cnt : cnts){
            if(cnt > 0){
                ans += cnt ;
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}