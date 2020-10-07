package leetcode.editor.cn;

//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
// 👍 156 👎 0

import java.util.ArrayList;
import java.util.List;

public class HeWeiSdeLianXuZhengShuXuLieLcof{
    public static void main(String[] args) {
        Solution solution = new HeWeiSdeLianXuZhengShuXuLieLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] findContinuousSequence(int target) {
        int left = 1 ;   //滑动窗口左边界
        int right = 1 ;  //滑动窗口右边界
        int sum = 0 ;    //滑动窗口数字的和
        List<int[]> ans = new ArrayList<>() ;
        while(left <= target / 2){
            if(sum < target){
                sum += right ;
                right++ ;
            }
            else if(sum > target){
                sum -= left ;
                left++ ;
            }
            else{
                int[] tem = new int[right - left] ;
                for(int k = left ; k < right ; k++){
                    tem[k - left] = k ;
                }
                ans.add(tem) ;
                //滑动窗口向右移动：
                sum -= left ;
                left++ ;
            }
        }
        return ans.toArray(new int[ans.size()][]) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}