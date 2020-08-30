package leetcode.editor.cn;

//给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。 
//
// 
//
// 示例 1： 
//
// 输入：low = 3, high = 7
//输出：3
//解释：3 到 7 之间奇数数字为 [3,5,7] 。 
//
// 示例 2： 
//
// 输入：low = 8, high = 10
//输出：1
//解释：8 到 10 之间奇数数字为 [9] 。 
//
// 
//
// 提示： 
//
// 
// 0 <= low <= high <= 10^9 
// 
// Related Topics 数学 
// 👍 7 👎 0

public class CountOddNumbersInAnIntervalRange{
    public static void main(String[] args) {
        Solution solution = new CountOddNumbersInAnIntervalRange().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countOdds(int low, int high) {
        return preSum(high) - preSum(low - 1);
    }

    public int preSum(int num){
        return (num + 1) >> 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}