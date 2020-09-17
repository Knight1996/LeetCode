package leetcode.editor.cn;

//在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。 
//
// 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望索引的数字 i 和 j 满足 i < j 且有 (time[i] + tim
//e[j]) % 60 == 0。 
//
// 
//
// 示例 1： 
//
// 输入：[30,20,150,100,40]
//输出：3
//解释：这三对的总持续时间可被 60 整数：
//(time[0] = 30, time[2] = 150): 总持续时间 180
//(time[1] = 20, time[3] = 100): 总持续时间 120
//(time[1] = 20, time[4] = 40): 总持续时间 60
// 
//
// 示例 2： 
//
// 输入：[60,60,60]
//输出：3
//解释：所有三对的总持续时间都是 120，可以被 60 整数。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= time.length <= 60000 
// 1 <= time[i] <= 500 
// 
// Related Topics 数组 
// 👍 104 👎 0

public class PairsOfSongsWithTotalDurationsDivisibleBy60{
    public static void main(String[] args) {
        Solution solution = new PairsOfSongsWithTotalDurationsDivisibleBy60().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int cnt = 0 ;
        int[] seconds = new int[60] ;
        for(int t : time){
            seconds[t % 60] ++ ;
        }

        cnt += combination(seconds[30]) ;
        cnt += combination(seconds[0]) ;
        int i = 1 ,j = 59 ;
        while(i < j){
            cnt += seconds[i++] * seconds[j--];
        }

        return cnt ;
    }

    //求组合数
    public int combination(int n ){
        return n * (n - 1) / 2 ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}