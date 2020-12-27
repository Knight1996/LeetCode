package leetcode.editor.cn;

//给你数字 k ，请你返回和为 k 的斐波那契数字的最少数目，其中，每个斐波那契数字都可以被使用多次。 
//
// 斐波那契数字定义为： 
//
// 
// F1 = 1 
// F2 = 1 
// Fn = Fn-1 + Fn-2 ， 其中 n > 2 。 
// 
//
// 数据保证对于给定的 k ，一定能找到可行解。 
//
// 
//
// 示例 1： 
//
// 输入：k = 7
//输出：2 
//解释：斐波那契数字为：1，1，2，3，5，8，13，……
//对于 k = 7 ，我们可以得到 2 + 5 = 7 。 
//
// 示例 2： 
//
// 输入：k = 10
//输出：2 
//解释：对于 k = 10 ，我们可以得到 2 + 8 = 10 。
// 
//
// 示例 3： 
//
// 输入：k = 19
//输出：3 
//解释：对于 k = 19 ，我们可以得到 1 + 5 + 13 = 19 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= 10^9 
// 
// Related Topics 贪心算法 数组 
// 👍 20 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK{
    public static void main(String[] args) {
        Solution solution = new FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinFibonacciNumbers(int k) {
//      -----------------------------------------贪心---------------------------------------
        // 1、不会选择两个连续的斐波那切数
        // 2、不会选择两个重复的斐波那契数
        // 3、不会选择比k 大的斐波那契数
        int pre = 1 , cur = 1 ;
        List<Integer> list = new ArrayList<>(Arrays.asList(pre , cur)) ;
        while(pre + cur <= k){
            int tem = pre + cur ;
            list.add(tem);
            pre = cur ;
            cur = tem ;
        }

        int ans = 0 ;
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            if(list.get(i) <= k){
                ans++ ;
                k -= list.get(i) ;
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}