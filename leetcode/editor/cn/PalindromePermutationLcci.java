package leetcode.editor.cn;

//给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。 
//
// 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。 
//
// 回文串不一定是字典当中的单词。 
//
// 
//
// 示例1： 
//
// 输入："tactcoa"
//输出：true（排列有"tacocat"、"atcocta"，等等）
// 
//
// 
// Related Topics 哈希表 字符串 
// 👍 35 👎 0

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationLcci{
    public static void main(String[] args) {
        Solution solution = new PalindromePermutationLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPermutePalindrome(String s) {
        //统计每个字符出现的次数
        Map<Character , Integer> map = new HashMap<Character , Integer>();
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1) ;
        }

        //若出现奇数次的字符为 0 或 1  则可回文排列
        int cnt = 0 ;
        for(char ch : map.keySet()){
            if(map.get(ch) % 2 == 1){
                cnt++ ;
            }
        }

        return cnt <= 1 ;
        //return cnt == 0 || cnt == 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}