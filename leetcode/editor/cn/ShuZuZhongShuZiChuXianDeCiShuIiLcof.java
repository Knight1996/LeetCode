package leetcode.editor.cn;

//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [3,4,3,3]
//输出：4
// 
//
// 示例 2： 
//
// 输入：nums = [9,1,7,9,7,9,7]
//输出：1 
//
// 
//
// 限制： 
//
// 
// 1 <= nums.length <= 10000 
// 1 <= nums[i] < 2^31 
// 
//
// 
// 👍 88 👎 0

import java.util.HashMap;
import java.util.Map;

public class ShuZuZhongShuZiChuXianDeCiShuIiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongShuZiChuXianDeCiShuIiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {

//      -------------------------hashMap----------------------------
        /*HashMap<Integer , Integer> hashMap = new HashMap<>() ;

        for(int i = 0 ; i < nums.length ; i++){
            hashMap.put(nums[i] , hashMap.getOrDefault(nums[i] , 0) + 1) ;
        }

        //  Map.entrySet()  这个方法返回的是一个Set<Map.Entry<K,V>>
        //    Map.Entry     是Map中的一个接口，他的用途是表示一个映射项（里面有Key和Value）

        for(Map.Entry<Integer , Integer> entry : hashMap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey() ;
            }
        }

        return -1 ;*/

//      ----------------------------有限状态自动机-------------------------------
        int ones = 0 , twos = 0 ;

        for(int num : nums){
            ones = ones ^ num & ~twos ;
            twos = twos ^ num & ~ones ;
        }

        return ones ;
}
//leetcode submit region end(Prohibit modification and deletion)

}