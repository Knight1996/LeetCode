package leetcode.editor.cn;

//给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位
//。 
//
// 返回滑动窗口中的最大值。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
//输出：[3,3,5,5,6,7]
//解释：
//滑动窗口的位置                最大值
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7
// 
//
// 示例 2： 
//
// 
//输入：nums = [1], k = 1
//输出：[1]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,-1], k = 1
//输出：[1,-1]
// 
//
// 示例 4： 
//
// 
//输入：nums = [9,11], k = 2
//输出：[11]
// 
//
// 示例 5： 
//
// 
//输入：nums = [4,-2], k = 2
//输出：[4] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 105 
// -104 <= nums[i] <= 104 
// 1 <= k <= nums.length 
// 
// Related Topics 堆 Sliding Window 
// 👍 870 👎 0

import java.util.LinkedList;

public class SlidingWindowMaximum{
    public static void main(String[] args) {
        Solution solution = new SlidingWindowMaximum().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
//      -------------------------遍历数组----------------------------
        /*int len = nums.length ;
        if(len == 0){
            return new int[0] ;
        }
        int[] ans = new int[len - k + 1] ;
        for(int i = 0 ; i <= len - k ; i++){
            int maxNum = Integer.MIN_VALUE ;
            for(int j = i ; j < i + k ; j++){
                maxNum = Math.max(maxNum , nums[j]) ;
            }
            ans[i] = maxNum ;
        }
        return ans ;*/
//      ---------------------------------------------------------------

//      ----------------------------双端队列----------------------------
        // 始终保证队头是队列中最大的值
        // 队列中添加的是数组的下标
        int len = nums.length ;
        if(len == 0){
            return new int[0] ;
        }
        LinkedList<Integer> queue = new LinkedList<>() ;
        int[] ans = new int[len - k + 1] ;
        int index = 0 ;
        for(int i = 0 ; i < len ; i++){
            // 始终保证队头是队列中最大的值
            while(!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]){
                queue.pollLast() ;
            }
            queue.addLast(i);

            // 队列头已经在窗口之外，弹出队列头
            if(queue.peekFirst() == i - k){
                queue.pollFirst() ;
            }
            if(i >= k - 1){
                ans[index++] = nums[queue.peekFirst()] ;
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}