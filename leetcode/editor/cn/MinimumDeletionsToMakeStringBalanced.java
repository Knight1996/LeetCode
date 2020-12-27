package leetcode.editor.cn;

//给你一个字符串 s ，它仅包含字符 'a' 和 'b' 。 
//
// 你可以删除 s 中任意数目的字符，使得 s 平衡 。我们称 s 平衡的 当不存在下标对 (i,j) 满足 i < j 且 s[i] = 'b' 同时 s[
//j]= 'a' 。 
//
// 请你返回使 s 平衡 的 最少 删除次数。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "aababbab"
//输出：2
//解释：你可以选择以下任意一种方案：
//下标从 0 开始，删除第 2 和第 6 个字符（"aababbab" -> "aaabbb"），
//下标从 0 开始，删除第 3 和第 6 个字符（"aababbab" -> "aabbbb"）。
// 
//
// 示例 2： 
//
// 
//输入：s = "bbaaaaabb"
//输出：2
//解释：唯一的最优解是删除最前面两个字符。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 105 
// s[i] 要么是 'a' 要么是 'b' 。 
// 
// Related Topics 贪心算法 字符串 
// 👍 10 👎 0

public class MinimumDeletionsToMakeStringBalanced{
    public static void main(String[] args) {
        Solution solution = new MinimumDeletionsToMakeStringBalanced().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumDeletions(String s) {
        int cnt=0;  // 统计 字母 b 数量
        int ans=0;
        for (int i = 0; i < s.length() ; i++) {
            // 此处为 字母 b
            if ('b' == s.charAt(i)) {
                cnt++;
            }
            // 此处为 字母 a
            else {
                // 此处为 字母 a , 前 i - 1 个字符中存在 字母 b ：
                // 将上次出现的 字母 b 删除:  ans++;  cnt--;
                if (cnt>0) {
                    ans++;
                    cnt--;
                }
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}