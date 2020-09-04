package leetcode.editor.cn;

//给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺
//序）。 
//
// 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。 
//
// 示例: 
//
// 
//输入:
//[[0,0],[1,0],[2,0]]
//
//输出:
//2
//
//解释:
//两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
// 
// Related Topics 哈希表 
// 👍 103 👎 0

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs{
    public static void main(String[] args) {
        Solution solution = new NumberOfBoomerangs().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0 ;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < points.length ; i++){
            hashMap.clear();
            for(int j = 0 ; j < points.length ; j++){
                if(i != j){
                    int distance = distance(points[i], points[j]) ;
                    hashMap.put(distance , hashMap.getOrDefault(distance , 0) + 1) ;
                }
            }
            for(int distance : hashMap.keySet()){
                ans += (hashMap.get(distance)) * (hashMap.get(distance) - 1) ;
            }
        }
        return ans ;
    }

    public int distance(int[] a , int[] b){
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}