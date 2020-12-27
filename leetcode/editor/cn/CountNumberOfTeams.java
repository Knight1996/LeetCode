package leetcode.editor.cn;

//n 名士兵站成一排。每个士兵都有一个 独一无二 的评分 rating 。 
//
// 每 3 个士兵可以组成一个作战单位，分组规则如下： 
//
// 
// 从队伍中选出下标分别为 i、j、k 的 3 名士兵，他们的评分分别为 rating[i]、rating[j]、rating[k] 
// 作战单位需满足： rating[i] < rating[j] < rating[k] 或者 rating[i] > rating[j] > rating[
//k] ，其中 0 <= i < j < k < n 
// 
//
// 请你返回按上述条件可以组建的作战单位数量。每个士兵都可以是多个作战单位的一部分。 
//
// 
//
// 示例 1： 
//
// 输入：rating = [2,5,3,4,1]
//输出：3
//解释：我们可以组建三个作战单位 (2,3,4)、(5,4,1)、(5,3,1) 。
// 
//
// 示例 2： 
//
// 输入：rating = [2,1,3]
//输出：0
//解释：根据题目条件，我们无法组建作战单位。
// 
//
// 示例 3： 
//
// 输入：rating = [1,2,3,4]
//输出：4
// 
//
// 
//
// 提示： 
//
// 
// n == rating.length 
// 1 <= n <= 200 
// 1 <= rating[i] <= 10^5 
// 
// Related Topics 数组 
// 👍 50 👎 0

public class CountNumberOfTeams{
    public static void main(String[] args) {
        Solution solution = new CountNumberOfTeams().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTeams(int[] rating) {
//      -----------------------------------暴力循环--------------------------------------
        /*int len = rating.length;
        int ans = 0 ;
        for(int i = 0 ; i < len ; i++){
            for(int j = i + 1 ; j < len ; j++){
                for(int k = j + 1 ; k < len ; k++){
                    if((rating[i] < rating[j] && rating[j] < rating[k])||
                            (rating[i] > rating[j] && rating[j] > rating[k])){
                        ans++ ;
                    }
                }
            }
        }
        return ans ;*/
//      -----------------------------------------------------------------------------------

//      -------------------------------------枚举中间点-------------------------------------
        int len = rating.length;
        int ans = 0 ;
        for(int i = 1 ; i < len - 1 ; i++){
            int[] leftCount = count(0 , i - 1 , rating , rating[i]) ;
            int[] rightCount = count(i + 1 , len - 1 , rating , rating[i]) ;
            ans += leftCount[0] * rightCount[1]; // 以i为中间士兵，左边比他大的数量 * 右边比他小的数量
            ans += leftCount[1] * rightCount[0]; // 以i为中间士兵，左边比他小的数量 * 右边比他大的数量
        }
        return ans ;
//      ------------------------------------------------------------------------------------------------
    }

    public int[] count(int start , int end , int[] arr , int target){
        int[] res = new int[2] ;
        for(int i = start ; i <= end ; i++){
            // 该值比 target 大 ， 计入arr[0]:
            if(arr[i] > target){
                res[0]++ ;
            }
            // 该值比 target 小 ， 计入arr[1]:
            if(arr[i] < target){
                res[1]++ ;
            }
        }
        return res ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}