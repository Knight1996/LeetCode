package leetcode.editor.cn;

//找出数组中重复的数字。 
//
// 
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
//找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
// Related Topics 数组 哈希表 
// 👍 176 👎 0

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShuZuZhongZhongFuDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongZhongFuDeShuZiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findRepeatNumber(int[] nums) {
//     ---------------------------------排序-----------------------------
        /*Arrays.sort(nums) ;
        for(int  i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == nums[i + 1]){
                return nums[i] ;
            }
        }
        return -1 ;*/
//     --------------------------------------------------------------------

//     --------------------------------Set----------------------------------
       /* Set<Integer> set = new HashSet<>() ;
        for(int num : nums){
            if(!set.add(num)){
                return num ;
            }
        }
        return -1 ;*/
//     --------------------------------------------------------------------
//
//     -------------------------------临时数组----------------------------------
        /*int[] cnt = new int[nums.length] ;
        for(int i = 0 ; i < nums.length ; i++){
            cnt[nums[i]]++ ;
            if(cnt[nums[i]] > 1){
                return nums[i] ;
            }
        }
        return -1 ;*/
//     ----------------------------------------------------------------------

//      -------------------------------原地置换----------------------------------
        int tem ;
        for(int i = 0 ; i < nums.length ; i++){
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    return nums[i] ;
                }
                //swap(nums[i] , nums[nums[i]])
                tem = nums[i];
                nums[i] = nums[tem];
                nums[tem] = tem;
            }
        }
        return -1 ;
//     ----------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}