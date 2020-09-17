package leetcode.editor.cn;

//给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。 
//
// 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。 
//
// 示例 1: 
//
// 
//输入: [1, 2, 2, 3, 1]
//输出: 2
//解释: 
//输入数组的度是2，因为元素1和2的出现频数最大，均为2.
//连续子数组里面拥有相同度的有如下所示:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//最短连续子数组[2, 2]的长度为2，所以返回2.
// 
//
// 示例 2: 
//
// 
//输入: [1,2,2,3,1,4,2]
//输出: 6
// 
//
// 注意: 
//
// 
// nums.length 在1到50,000区间范围内。 
// nums[i] 是一个在0到49,999范围内的整数。 
// 
// Related Topics 数组 
// 👍 169 👎 0

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray{
    public static void main(String[] args) {
        Solution solution = new DegreeOfAnArray().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findShortestSubArray(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1){
            return len ;
        }

        //map1 用来统计数组中每个元素出现的次数
        Map<Integer , Integer> map1 = new HashMap<>() ;
        //map2 用来记录数组中元素第一次出现时的位置（索引）
        Map<Integer , Integer> map2 = new HashMap<>() ;
        //map3 用来记录数组相同元素，第一次出现与最后一次出现之间的长度
        Map<Integer , Integer> map3 = new HashMap<>() ;

        for(int i = 0 ; i < nums.length ; i++){
            map1.put(nums[i] , map1.getOrDefault(nums[i] , 0) + 1) ;
            if(!map2.containsKey(nums[i])){
                map2.put(nums[i] , i) ;
            }
            map3.put(nums[i] , i - map2.get(nums[i]) + 1) ;
        }

        int maxCount = 0 ;
        for(int num : map1.values()){
            maxCount = Math.max(maxCount , num) ;
        }

        int ans = Integer.MAX_VALUE ;
        for(int key : map1.keySet()){
            if(maxCount == map1.get(key)){
                ans = Math.min(ans , map3.get(key)) ;
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}