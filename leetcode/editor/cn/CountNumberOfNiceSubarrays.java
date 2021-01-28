package leetcode.editor.cn;

//给你一个整数数组 nums 和一个整数 k。 
//
// 如果某个 连续 子数组中恰好有 k 个奇数数字，我们就认为这个子数组是「优美子数组」。 
//
// 请返回这个数组中「优美子数组」的数目。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [1,1,2,1,1], k = 3
//输出：2
//解释：包含 3 个奇数的子数组是 [1,1,2,1] 和 [1,2,1,1] 。
// 
//
// 示例 2： 
//
// 输入：nums = [2,4,6], k = 1
//输出：0
//解释：数列中不包含任何奇数，所以不存在优美子数组。
// 
//
// 示例 3： 
//
// 输入：nums = [2,2,2,1,2,2,1,2,2,2], k = 2
//输出：16
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50000 
// 1 <= nums[i] <= 10^5 
// 1 <= k <= nums.length 
// 
// Related Topics 双指针 
// 👍 147 👎 0

public class CountNumberOfNiceSubarrays{
    public static void main(String[] args) {
        Solution solution = new CountNumberOfNiceSubarrays().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
//      --------------------------------数学推导-------------------------------
        /*int ans = 0 ;
        int cnt = 0 ;
        int len = nums.length ;
        int[] odds = new int[len + 2] ;

        for(int i = 0 ; i < len ; i++){
            if((nums[i] & 1) == 1){
                cnt++ ;
                odds[cnt] = i ;
            }
        }
        odds[0] = -1 ;
        cnt++ ;
        odds[cnt] = len ;
        for(int i = 1 ; i + k <= cnt ; i++){
            ans += (odds[i] - odds[i - 1]) * (odds[i + k] - odds[i + k - 1]) ;
        }
        return ans ;*/
//      ----------------------------------------------------------------------

//      --------------------------------前缀和--------------------------------
        // arr[i] = arr[i−1] + (nums[i]&1)
        // arr[i] − arr[j−1] = k
        // arr[j − 1] = arr[i] − k
        // 所以我们考虑以 i 结尾的 优美子数组 个数时只要统计
        // 有多少个奇数个数为 arr[i] − k 的 arr[j] 即可。
        int ans = 0 ;
        int cnt = 0 ;
        int len = nums.length ;
        int[] arr = new int[len + 1] ;
        arr[0] = 1 ;
        for(int i = 0 ; i < len ; i++){
            cnt += (nums[i] & 1) ;
            if(cnt >= k){
                ans += arr[cnt - k];
            }
            arr[cnt]++ ;
        }
        return ans ;
//      ----------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}