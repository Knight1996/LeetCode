package leetcode.editor.cn;

//给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal",
// "Silver Medal", "Bronze Medal"）。 
//
// (注：分数越高的选手，排名越靠前。) 
//
// 示例 1: 
//
// 
//输入: [5, 4, 3, 2, 1]
//输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and 
//"Bronze Medal").
//余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。 
//
// 提示: 
//
// 
// N 是一个正整数并且不会超过 10000。 
// 所有运动员的成绩都不相同。 
// 
// 👍 55 👎 0

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks{
    public static void main(String[] args) {
        Solution solution = new RelativeRanks().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        Map<Integer , Integer> map = new HashMap<>(len);
        for(int i = 0 ; i < len ; i++){
            map.put(arr[i] , i);
        }
        String[] ans = new String[len];
        for(int i = 0 ; i < len ; i++){
            int index = map.get(nums[i]);
            if(index == len- 1){
                ans[i] = "Gold Medal";
            }
            else if(index == len- 2){
                ans[i] = "Silver Medal";
            }
            else if(index == len- 3){
                ans[i] = "Bronze Medal";
            }
            else{
                ans[i] = String.valueOf(len - index);
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}