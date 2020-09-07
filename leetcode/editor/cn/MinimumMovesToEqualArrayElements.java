package leetcode.editor.cn;

//给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动将会使 n - 1 个元素增加 1。 
//
// 
//
// 示例: 
//
// 输入:
//[1,2,3]
//
//输出:
//3
//
//解释:
//只需要3次移动（注意每次移动会增加两个元素的值）：
//
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
// 
// Related Topics 数学 
// 👍 141 👎 0

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements{
    public static void main(String[] args) {
        Solution solution = new MinimumMovesToEqualArrayElements().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minMoves(int[] nums) {
        int cnt = 0 ;
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++){
            cnt += nums[i] - nums[0] ;
        }
        return cnt ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}