package leetcode.editor.cn;

//给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。 
//
// 
//
// 示例 1： 
//
// 
//输入：timePoints = ["23:59","00:00"]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：timePoints = ["00:00","23:59","00:00"]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 2 <= timePoints <= 2 * 104 
// timePoints[i] 格式为 "HH:MM" 
// 
// Related Topics 字符串 
// 👍 68 👎 0

import java.util.Arrays;

public class MinimumTimeDifference{
    public static void main(String[] args) {
        Solution solution = new MinimumTimeDifference().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int len = timePoints.size() ;
        int[] times = new int[len] ;
        int i = 0 ;
        for(String timePoint : timePoints){
            int time = Integer.parseInt(timePoint.substring(0 , 2)) * 60 + Integer.parseInt(timePoint.substring(3 , 5));
            times[i] = time ;
            i++ ;
        }
        Arrays.sort(times);
        //先考虑隔天的差值
        int ans = 1440 - times[times.length - 1] + times[0] ;
        for(int j = 1 ; j < times.length ; j++){
            ans = Math.min(ans , times[j] - times[j - 1]);
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}