package leetcode.editor.cn;

//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。 
//
// 示例 1： 
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true 
// 
//
// 示例 2： 
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
// 
//
// 说明： 
//
// 
// 0 <= len(s1) <= 100 
// 0 <= len(s2) <= 100 
// 
// Related Topics 数组 字符串 
// 👍 17 👎 0

import java.util.HashMap;
import java.util.Map;

public class CheckPermutationLcci{
    public static void main(String[] args) {
        Solution solution = new CheckPermutationLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
//     -------------------------HashMap---------------------------------
        Map<Character , Integer> map1 = new HashMap<Character , Integer>() ;
        Map<Character , Integer> map2 = new HashMap<Character , Integer>() ;

        for(char ch1 : s1.toCharArray()){
            map1.put(ch1 , map1.getOrDefault(ch1 , 0) + 1) ;
        }

        for(char ch2 : s2.toCharArray()){
            map2.put(ch2 , map2.getOrDefault(ch2 , 0) + 1) ;
        }

        if(map1.size() != map2.size()){
            return false ;
        }
        for(char ch : map1.keySet()){
            if(map1.get(ch) != map2.get(ch)){
                return false ;
            }
        }
        return true ;
//      -----------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}