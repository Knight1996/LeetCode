package leetcode.editor.cn;

//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例: 
//
// s = "abaccdeff"
//返回 "b"
//
//s = "" 
//返回 " "
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 哈希表 
// 👍 46 👎 0

import java.util.HashMap;

public class DiYiGeZhiChuXianYiCiDeZiFuLcof{
    public static void main(String[] args) {
        Solution solution = new DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char firstUniqChar(String s) {
//      -------------------------哈希表-----------------------------------
        HashMap<Character , Boolean> hashMap = new HashMap<>() ;
        char[] chars = s.toCharArray() ;
        for(char c : chars){
            hashMap.put(c , hashMap.containsKey(c)) ;
        }
        for(char c: chars){
            if(!hashMap.get(c)){
                return c ;
            }
        }
        return ' ';

//     ------------------------索引-------------------------------
        /*for(char c : s.toCharArray()){
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return c ;
            }
        }
        return ' ' ;*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}