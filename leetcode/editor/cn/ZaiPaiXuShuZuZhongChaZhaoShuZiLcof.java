package leetcode.editor.cn;

//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 
// 👍 63 👎 0

public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
//     ----------------------------暴力----------------------------
        /*int ans = 0 ;
        for(int i : nums){
            if(i == target){
                ans++;
            }
        }
        return ans;*/
//      -------------------------二分查找------------------------------
        return binarySearch(nums , target + 0.5) - binarySearch(nums , target - 0.5) ;
    }

    public int binarySearch(int[] nums , double target){
        int left = 0 ;
        int right = nums.length - 1 ;
        while(left <= right){
            int mid = left + ((right - left) >> 1) ;
            if(nums[mid] < target){
                left = mid + 1 ;
            }
            else{
                right = mid - 1 ;
            }
        }
        return left ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}