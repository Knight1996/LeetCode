package leetcode.editor.cn;

//字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。 
//
// 
//
// 示例： 
//
// 
//输入：S = "ababcbacadefegdehijhklij"
//输出：[9,7,8]
//解释：
//划分结果为 "ababcbaca", "defegde", "hijhklij"。
//每个字母最多出现在一个片段中。
//像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
// 
//
// 
//
// 提示： 
//
// 
// S的长度在[1, 500]之间。 
// S只包含小写字母 'a' 到 'z' 。 
// 
// Related Topics 贪心算法 双指针 
// 👍 406 👎 0

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels{
    public static void main(String[] args) {
        Solution solution = new PartitionLabels().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] arr = new int[26] ;
        int len = S.length();

        // 统计字符串中每一个字符最后出现的位置：
        for(int i = 0 ; i < len ; i++){
            arr[S.charAt(i) - 'a'] = i ;
        }

        List<Integer> ans = new ArrayList<>() ;

        // 记录滑动窗口的左右边界：
        int left = 0 , right = 0 ;
        for(int i = 0 ; i < len ; i++){
            right = Math.max(right , arr[S.charAt(i) - 'a']) ;
            if(i == right){
                ans.add(right - left + 1) ;
                left = right + 1 ;
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}