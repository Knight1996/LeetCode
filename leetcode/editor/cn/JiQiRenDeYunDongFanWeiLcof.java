package leetcode.editor.cn;

//地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一
//格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但
//它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？ 
//
// 
//
// 示例 1： 
//
// 输入：m = 2, n = 3, k = 1
//输出：3
// 
//
// 示例 2： 
//
// 输入：m = 3, n = 1, k = 0
//输出：1
// 
//
// 提示： 
//
// 
// 1 <= n,m <= 100 
// 0 <= k <= 20 
// 
// 👍 173 👎 0

public class JiQiRenDeYunDongFanWeiLcof{
    public static void main(String[] args) {
        Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int movingCount(int m, int n, int k) {
//      ---------------------------递推---------------------------------
        if(k == 0){
            return 1 ;
        }
        boolean[][] flags = new boolean[m][n] ;
        int ans = 1 ;
        flags[0][0] = true ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if((i == 0 && j == 0) || helper(i) + helper(j) > k){
                    continue ;
                }
                // 左边界判断：
                if(i - 1 >= 0){
                    flags[i][j] |= flags[i - 1][j] ;
                }
                // 上边界判断：
                if(j - 1 >= 0){
                    flags[i][j] |= flags[i][j - 1] ;
                }
                ans += flags[i][j] ? 1 : 0 ;
            }
        }
        return ans ;
    }

    //helper:  求给定数字的各个数位数字之和
    public int helper(int num){
        int sum = 0 ;
        while(num != 0){
            sum += num % 10 ;
            num /= 10 ;
        }
        return sum ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}