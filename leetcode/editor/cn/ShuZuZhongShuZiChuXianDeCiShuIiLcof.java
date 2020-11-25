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
// 👍 100 👎 0

import java.util.HashMap;
import java.util.Map;

public class ShuZuZhongShuZiChuXianDeCiShuIiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongShuZiChuXianDeCiShuIiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
//      -------------------------------Hash表---------------------------------
       /* // Map.Entry是Map声明的一个内部接口，此接口为泛型，定义为Entry<K,V>。
        // 它表示Map中的一个实体（一个key-value对）

        //entrySet是 java中 键-值 对的集合，Set里面的类型是Map.Entry，一般可以通过map.entrySet()得到。
        //entrySet实现了Set接口，里面存放的是键值对。一个K对应一个V。
        Map<Integer , Integer> map = new HashMap<>() ;
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1) ;
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey() ;
            }
        }
        return 0 ;*/

//      ------------------------------逐位判断---------------------------------
        // 统计数组 nums 所有元素对应位的 1 的个数，最后在与 3 求余，
        // 即可而得到只出现 1 次的数字
        /* int ans = 0 ;
        int bit = 1 ;
        for(int i = 0 ; i < 32 ; i++){
            int cnt = 0 ;
            for(int num : nums){
                if((num & bit) != 0){
                    cnt++ ;
                }
            }
            if(cnt % 3 == 1){
                ans |= bit ;
            }
            bit <<= 1 ;
        }
        return ans ;*/

//      ------------------------------有限元状态机----------------------------
        int ones = 0 , twos = 0 ;
        for(int num : nums){
            ones = ones ^ num & ~twos ;
            twos = twos ^ num & ~ones ;
        }
        return ones ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}