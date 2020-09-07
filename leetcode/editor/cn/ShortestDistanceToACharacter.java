package leetcode.editor.cn;

//给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。 
//
// 示例 1: 
//
// 
//输入: S = "loveleetcode", C = 'e'
//输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
// 
//
// 说明: 
//
// 
// 字符串 S 的长度范围为 [1, 10000]。 
// C 是一个单字符，且保证是字符串 S 里的字符。 
// S 和 C 中的所有字母均为小写字母。 
// 
// 👍 148 👎 0

public class ShortestDistanceToACharacter{
    public static void main(String[] args) {
        Solution solution = new ShortestDistanceToACharacter().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] shortestToChar(String S, char C) {
        int len = S.length() ;
        int[] ans = new int[len] ;

        int prev = Integer.MIN_VALUE / 2 ;
        for(int i = 0 ; i < len ; i++){
            if(S.charAt(i) == C){
                prev = i ;
            }
            ans[i] = i - prev ;
        }

        prev = Integer.MAX_VALUE / 2 ;
        for(int i = len - 1 ; i >= 0 ; i--){
            if(S.charAt(i) == C){
                prev = i ;
            }
            ans[i] = Math.min(prev - i , ans[i]) ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}