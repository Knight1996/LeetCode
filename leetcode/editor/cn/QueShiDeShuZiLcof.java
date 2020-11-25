package leetcode.editor.cn;

//一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出
//这个数字。 
//
// 
//
// 示例 1: 
//
// 输入: [0,1,3]
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [0,1,2,3,4,5,6,7,9]
//输出: 8 
//
// 
//
// 限制： 
//
// 1 <= 数组长度 <= 10000 
// Related Topics 数组 二分查找 
// 👍 64 👎 0

public class QueShiDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new QueShiDeShuZiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
//      --------------------------求和------------------------------
        /*int sum = 0 ;
        for(int i = 0 ; i <= nums.length ; i++){
            sum += i ;
        }
        for(int num : nums){
            sum -= num ;
        }
        return sum ;*/
//      --------------------------------------------------------------

//      ------------------------利用排序数组条件-----------------------
        /*for(int i = 0 ; i < nums.length ; i++){
            if(i != nums[i]){
                return i ;
            }
        }
        return nums.length ;*/
//      --------------------------------------------------------------

//      ---------------------------二分查找----------------------------
        /*int left = 0 , right = nums.length ;
        while(left < right){
            int mid = left + (right - left) / 2 ;
            if(mid == nums[mid]){
                left = mid + 1 ;
            }
            else{
                right = mid ;
            }
        }
        return left ;  //return right ;*/
//      ----------------------------------------------------------------

//      --------------------------位运算(异或)---------------------------
        int ans = 0 ;
        for(int i = 1 ; i <= nums.length ; i++){
            ans ^= i ;
        }
        for(int num : nums){
            ans ^= num ;
        }
        return ans ;
//      -----------------------------------------------------------------


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}