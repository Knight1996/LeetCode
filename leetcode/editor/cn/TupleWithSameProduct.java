package leetcode.editor.cn;

//给你一个由 不同 正整数组成的数组 nums ，请你返回满足 a * b = c * d 的元组 (a, b, c, d) 的数量。其中 a、b、c 和 d
// 都是 nums 中的元素，且 a != b != c != d 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,3,4,6]
//输出：8
//解释：存在 8 个满足题意的元组：
//(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
//(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,4,5,10]
//输出：16
//解释：存在 16 个满足题意的元组：
//(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
//(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
//(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,4,5)
//(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)
// 
//
// 示例 3： 
//
// 
//输入：nums = [2,3,4,6,8,12]
//输出：40
// 
//
// 示例 4： 
//
// 
//输入：nums = [2,3,5,7]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 1000 
// 1 <= nums[i] <= 104 
// nums 中的所有元素 互不相同 
// 
// Related Topics 数组 哈希表 
// 👍 9 👎 0

import java.util.Arrays;
import java.util.HashMap;

public class TupleWithSameProduct{
    public static void main(String[] args) {
        Solution solution = new TupleWithSameProduct().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int tupleSameProduct(int[] nums) {
//      -------------------------排序遍历-----------------------------
        /*int len = nums.length ;
        if(len < 4){
            return 0 ;
        }
        Arrays.sort(nums) ;
        int ans = 0 ;
        for(int i = 0 ; i < len - 3 ; i++){
            for(int j = i + 3 ; j < len ; j++){
                int tem1 = nums[i] * nums[j] ;
                int index1 = i + 1 ;
                int index2 = j - 1 ;
                while(index1 < index2){
                    int tem2 = nums[index1] * nums[index2] ;
                    if(tem1 == tem2){
                        ans++ ;
                        index1++ ;
                        index2-- ;
                    }
                    else if(tem2 > tem1){
                        index2-- ;
                    }
                    else{
                        index1++ ;
                    }
                }
            }
        }
        return ans << 3;*/
//      -----------------------------------------------------------------

//      ---------------------------hashMap(加法)-------------------------------
        /*HashMap<Integer , Integer> map = new HashMap<>() ;
        int ans = 0 ;
        int len = nums.length ;
        for(int i = 0 ; i < len ; i++){
            for(int j = i + 1 ; j < len ; j++){
                int key = nums[i] * nums[j] ;
                Integer val = map.get(key) ;
                if(val != null){
                    ans += val ;
                    map.put(key , ++val) ;
                }
                else{
                    map.put(key , 1) ;
                }
            }
        }
        return ans << 3 ;*/
//      -----------------------------------------------------------------

//      ---------------------------hashMap(加法)-------------------------------
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int ans = 0 ;
        int len = nums.length ;
        for(int i = 0 ; i < len ; i++){
            for(int j = i + 1 ; j < len ; j++){
                int key = nums[i] * nums[j] ;
                map.put(key , map.getOrDefault(key , 0) + 1) ;
            }
        }
        for(int n : map.values()){
            ans += n * (n - 1) * 4 ;
        }
        return ans;
//      -----------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}