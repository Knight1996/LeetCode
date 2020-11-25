package leetcode.editor.cn;

//从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任
//意数字。A 不能视为 14。 
//
// 
//
// 示例 1: 
//
// 输入: [1,2,3,4,5]
//输出: True 
//
// 
//
// 示例 2: 
//
// 输入: [0,0,1,2,5]
//输出: True 
//
// 
//
// 限制： 
//
// 数组长度为 5 
//
// 数组的数取值为 [0, 13] . 
// 👍 79 👎 0

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BuKePaiZhongDeShunZiLcof{
    public static void main(String[] args) {
        Solution solution = new BuKePaiZhongDeShunZiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isStraight(int[] nums) {
//      ----------------------------排序--------------------------------
        int joker = 0 ;   // 大小王数量
        Arrays.sort(nums) ;
        for(int i = 0 ; i < 4 ; i++){
            if(nums[i] == 0){
                joker++ ;
            }
            else if(nums[i] == nums[i + 1]){
                return false ;
            }
        }
        // 最大牌 - 最小牌 < 5   就可以顺子：
        return nums[4] - nums[joker] < 5 ;
//      ----------------------------------------------------------------

//      ----------------------------Set---------------------------------
        /*Set<Integer> set = new HashSet<>() ;
        int minNum = 14 , maxNum = 0 ;
        for(int num : nums){
            if(num == 0){
                continue ;
            }
            maxNum = Math.max(maxNum , num) ;
            minNum = Math.min(minNum , num) ;
            // 若有重复就不可以顺子：
            if(set.contains(num)){
                return false ;
            }
            set.add(num) ;
        }
        return maxNum - minNum < 5 ;*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}