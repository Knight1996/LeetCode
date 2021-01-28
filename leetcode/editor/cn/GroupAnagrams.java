package leetcode.editor.cn;

//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。 
//
// 示例: 
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// 说明： 
//
// 
// 所有输入均为小写字母。 
// 不考虑答案输出的顺序。 
// 
// Related Topics 哈希表 字符串 
// 👍 624 👎 0

import java.util.*;

public class GroupAnagrams{
    public static void main(String[] args) {
        Solution solution = new GroupAnagrams().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//      -----------------------------------HashMap-------------------------------------
        Map<String , List<String>> map = new HashMap<>() ;
        for(String s : strs){
            char[] arr = s.toCharArray() ;
            Arrays.sort(arr);
            // 以排序后的 String 为 键
            String key = new String(arr) ;
            // 以有相同序列的 String List 为 值
            List<String> value = map.getOrDefault(key , new ArrayList<>()) ;
            value.add(s);
            map.put(key, value) ;
        }
        return new ArrayList<List<String>>(map.values());
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}