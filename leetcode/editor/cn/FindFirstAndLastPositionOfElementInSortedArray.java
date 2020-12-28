package leetcode.editor.cn;

//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 进阶： 
//
// 
// 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// nums 是一个非递减数组 
// -109 <= target <= 109 
// 
// Related Topics 数组 二分查找 
// 👍 785 👎 0

public class FindFirstAndLastPositionOfElementInSortedArray{
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
//      ----------------------------------二分查找-----------------------------------
        int leftIdx = binarySearch(nums, target, 1) ;
        int rightIdx = binarySearch(nums, target, 0) - 1;
        if (leftIdx <= rightIdx && leftIdx >= 0 && rightIdx < nums.length
                && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    //  flag 为 1 ：找左边界，第一个大于等于target的位置：
    //  flag 为 0 ：找右边界，第一个大于target的位置 - 1：
    public int binarySearch(int[] arr , int target , int flag){
        int left = 0, right = arr.length - 1, ans = arr.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < arr[mid] || (flag == 1 && target <= arr[mid])) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}