package leetcode.editor.cn;

//给你一个区间列表，请你删除列表中被其他区间所覆盖的区间。 
//
// 只有当 c <= a 且 b <= d 时，我们才认为区间 [a,b) 被区间 [c,d) 覆盖。 
//
// 在完成所有删除操作后，请你返回列表中剩余区间的数目。 
//
// 
//
// 示例： 
//
// 
//输入：intervals = [[1,4],[3,6],[2,8]]
//输出：2
//解释：区间 [3,6] 被区间 [2,8] 覆盖，所以它被删除了。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= intervals.length <= 1000 
// 0 <= intervals[i][0] < intervals[i][1] <= 10^5 
// 对于所有的 i != j：intervals[i] != intervals[j] 
// 
// Related Topics 贪心算法 排序 Line Sweep 
// 👍 29 👎 0

import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals{
    public static void main(String[] args) {
        Solution solution = new RemoveCoveredIntervals().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
//      -----------------------------贪心(自定义排序 + 比较区间端点)--------------------------------
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o2[1] - o1[1] ;
                }
                else{
                    return o1[0] - o2[0] ;
                }
            }
        });

        int len = intervals.length ;
        int ans = len ;
        int pre = intervals[0][1] ;
        for(int i = 1 ; i < len ; i++){
            if(pre >= intervals[i][1]){
                ans-- ;
            }
            else{
                pre = intervals[i][1] ;
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}