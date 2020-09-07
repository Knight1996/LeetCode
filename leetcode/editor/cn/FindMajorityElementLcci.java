package leetcode.editor.cn;

//数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。 
//
// 示例 1： 
//
// 输入：[1,2,5,9,5,9,5,5,5]
//输出：5 
//
// 
//
// 示例 2： 
//
// 输入：[3,2]
//输出：-1 
//
// 
//
// 示例 3： 
//
// 输入：[2,2,1,1,1,2,2]
//输出：2 
//
// 
//
// 说明： 
//你有办法在时间复杂度为 O(N)，空间复杂度为 O(1) 内完成吗？ 
// Related Topics 位运算 数组 分治算法 
// 👍 27 👎 0

import java.util.Arrays;

public class FindMajorityElementLcci{
    public static void main(String[] args) {
        Solution solution = new FindMajorityElementLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        //摩尔投票：
        int x = 0 ;
        int votes = 0 ;
        for(int num : nums){
            if(votes == 0){
                x = num ;
            }
            votes += num == x ? 1 : -1 ;
        }
        return x ;

        //排序：
        //Arrays.sort(nums);
        //return nums[nums.length/2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}