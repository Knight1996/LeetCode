package leetcode.editor.cn;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2813 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length ;
        if(nums == null || len < 3){
            return ans ;
        }
        Arrays.sort(nums);

        for(int first = 0 ; first < len ; first++){

            // 最小的数字大于0,跳出循环：
            if(nums[first] > 0){
                break ;
            }

            // 去掉重复：
            if(first > 0 && nums[first] == nums[first - 1]){
                continue ;
            }

            int second = first + 1 , third = len - 1 ;
            while(second < third){
                int tem = nums[first] + nums[second] + nums[third];
                if(tem == 0){
                    ans.add(Arrays.asList(nums[first] , nums[second] , nums[third]));

                    // 去掉左重复：
                    while(second < third && nums[second] == nums[second + 1]){
                        second++ ;
                    }

                    // 去掉右重复：
                    while(second < third && nums[third] == nums[third - 1]){
                        third-- ;
                    }

                    second++ ;
                    third-- ;

                }
                else if(tem < 0){
                    second++ ;
                }
                else if(tem > 0){
                    third-- ;
                }
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}