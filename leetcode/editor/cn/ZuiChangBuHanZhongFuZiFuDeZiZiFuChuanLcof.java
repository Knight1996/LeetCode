package leetcode.editor.cn;

//请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。 
//
// 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// s.length <= 40000 
// 
//
// 注意：本题与主站 3 题相同：https://leetcode-cn.com/problems/longest-substring-without-rep
//eating-characters/ 
// Related Topics 哈希表 双指针 Sliding Window 
// 👍 123 👎 0

import java.util.HashMap;

public class ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
//      ----------------------------哈希表--------------------------------
        /*HashMap<Character , Integer> hashMap = new HashMap<>() ;
        int i= -1 , ans = 0 ;
        for(int j = 0 ; j < s.length() ; j++){
            if(hashMap.containsKey(s.charAt(j))){
                i = Math.max(i , hashMap.get(s.charAt(j))) ;
            }
            hashMap.put(s.charAt(j) , j) ;
            ans = Math.max(ans , j - i) ;
        }
        return ans ;*/
//      ---------------------------------------------------------------------
        HashMap<Character , Integer> hashMap = new HashMap<>() ;
        int ans = 0 , tem = 0 ;
        for(int j = 0 ; j < s.length() ; j++){
            int i = hashMap.getOrDefault(s.charAt(j) , -1) ;
            hashMap.put(s.charAt(j) , j) ;
            // 转移方程：
            if(tem < j - i){
                tem++ ;
            }
            else{
                tem = j - i ;
            }
            ans = Math.max(ans , tem) ;
        }
        return ans ;
//      ----------------------------动态规划----------------------------------

//      ---------------------------------------------------------------------

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}