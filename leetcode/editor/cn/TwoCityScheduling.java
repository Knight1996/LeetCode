package leetcode.editor.cn;

//公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。 
//
// 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。 
//
// 
//
// 示例： 
//
// 输入：[[10,20],[30,200],[400,50],[30,20]]
//输出：110
//解释：
//第一个人去 A 市，费用为 10。
//第二个人去 A 市，费用为 30。
//第三个人去 B 市，费用为 50。
//第四个人去 B 市，费用为 20。
//
//最低总费用为 10 + 30 + 50 + 20 = 110，每个城市都有一半的人在面试。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= costs.length <= 100 
// costs.length 为偶数 
// 1 <= costs[i][0], costs[i][1] <= 1000 
// 
// Related Topics 贪心算法 
// 👍 163 👎 0

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling{
    public static void main(String[] args) {
        Solution solution = new TwoCityScheduling().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int twoCitySchedCost(int[][] costs) {
//      --------------------------------------贪心-------------------------------------------
        // 假设初始化时 2N 全部去 B 市，从中再挑出 N 个去 A 市 ，
        // 找出 costs[i][0] - costs[i][1] 最小的 N 个人：

        int len = costs.length / 2 ;
        int ans = 0 ;

        // 按 costs[i][0] - costs[i][1] 升序排序：
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] - o1[1]) - (o2[0] - o2[1]);
            }
        });
        for(int i = 0 ; i < len ; i++){
            ans += (costs[i][0] + costs[i + len][1]) ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}