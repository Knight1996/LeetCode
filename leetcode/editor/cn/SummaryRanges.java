package leetcode.editor.cn;

//给定一个无重复元素的有序整数数组 nums 。 
//
// 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 num
//s 的数字 x 。 
//
// 列表中的每个区间范围 [a,b] 应该按如下格式输出： 
//
// 
// "a->b" ，如果 a != b 
// "a" ，如果 a == b 
// 
//
// 
//
// 示例 1： 
//
// 输入：nums = [0,1,2,4,5,7]
//输出：["0->2","4->5","7"]
//解释：区间范围是：
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
// 
//
// 示例 2： 
//
// 输入：nums = [0,2,3,4,6,8,9]
//输出：["0","2->4","6","8->9"]
//解释：区间范围是：
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"
// 
//
// 示例 3： 
//
// 输入：nums = []
//输出：[]
// 
//
// 示例 4： 
//
// 输入：nums = [-1]
//输出：["-1"]
// 
//
// 示例 5： 
//
// 输入：nums = [0]
//输出：["0"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 20 
// -231 <= nums[i] <= 231 - 1 
// nums 中的所有值都 互不相同 
// 
// Related Topics 数组 
// 👍 81 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges{
    public static void main(String[] args) {
        Solution solution = new SummaryRanges().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> summaryRanges(int[] nums) {
//      -------------------------------------模拟-------------------------------------------
        List<String> ans = new ArrayList<>() ;

        for(int i = 0 , j = 0; j < nums.length ; j++){
            i = j ;
            // 判断是否有 连续递增区间 ：
            while(j + 1 < nums.length && nums[j + 1] == nums[j] + 1){
                j++ ;
            }
            if(i == j){
                ans.add(String.valueOf(nums[i]));
            }
            else{
                ans.add(nums[i] + "->" + nums[j]);
            }
        }
        return ans ;
//      -----------------------------------------------------------------------------------
        /*将字符串转换为数字：
        int n =Integer.parseInt(s);
        注意：s1必须保证是数字字符串，否则不可以。

        将数字转换为字符串(如下三种方法)：
        String s = String.valueOf(n);
        String s = Integer.toString(n);
        String s = n+""; */
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}