package leetcode.editor.cn;

//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,3,2]
//输出: 3
// 
//
// 示例 2: 
//
// 输入: [0,1,0,1,0,1,99]
//输出: 99 
// Related Topics 位运算 
// 👍 418 👎 0

import java.util.HashMap;

public class SingleNumberIi{
    public static void main(String[] args) {
        Solution solution = new SingleNumberIi().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
//      -------------------------------hashMap--------------------------------
        HashMap<Integer , Integer> hashMap = new HashMap<>() ;
        for(int num : nums){
            hashMap.put(num , hashMap.getOrDefault(num , 0) + 1) ;
        }

        for(int k : hashMap.keySet()){
            if(hashMap.get(k) == 1){
                return k ;
            }
        }
        return -1 ;
//      -----------------------------------------------------------------------

//      -------------------------------位运算-----------------------------------
        /*int ones = 0 , twos = 0 ;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;*/
//      ------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}