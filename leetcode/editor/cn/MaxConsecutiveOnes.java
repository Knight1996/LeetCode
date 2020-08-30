package leetcode.editor.cn;

//给定一个二进制数组， 计算其中最大连续1的个数。 
//
// 示例 1: 
//
// 
//输入: [1,1,0,1,1,1]
//输出: 3
//解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
// 
//
// 注意： 
//
// 
// 输入的数组只包含 0 和1。 
// 输入数组的长度是正整数，且不超过 10,000。 
// 
// Related Topics 数组 
// 👍 116 👎 0

public class MaxConsecutiveOnes{
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnes().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0 ;
        int ans = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                cnt++ ;
            }else{
                ans = Math.max(cnt , ans);
                cnt = 0 ;
            }
        }
        return Math.max(cnt , ans) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}