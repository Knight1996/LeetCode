package leetcode.editor.cn;

//给定一个整数数组，找出总和最大的连续数列，并返回总和。 
//
// 示例： 
//
// 输入： [-2,1,-3,4,-1,2,1,-5,4]
//输出： 6
//解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶： 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划 
// 👍 40 👎 0

public class ContiguousSequenceLcci{
    public static void main(String[] args) {
        Solution solution = new ContiguousSequenceLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int k = nums[0] ;
        int sum = k ;
        for(int i = 1 ; i < nums.length ; i++){
            if(k < 0){
                k = nums[i] ;
            }
            else{
                k += nums[i] ;
            }
            if(k > sum){
                sum = k ;
            }
        }
        return sum ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}