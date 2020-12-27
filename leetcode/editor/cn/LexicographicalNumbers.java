package leetcode.editor.cn;

//给定一个整数 n, 返回从 1 到 n 的字典顺序。 
//
// 例如， 
//
// 给定 n =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。 
//
// 请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据 n 小于等于 5,000,000。 
// 👍 148 👎 0

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers{
    public static void main(String[] args) {
        Solution solution = new LexicographicalNumbers().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> lexicalOrder(int n) {
//      -----------------------------------DFS（回溯）-----------------------------------------
        List<Integer> ans = new ArrayList<>() ;
        for(int i = 1 ; i < 10 ; i++){
            helper(n , i , ans) ;
        }
        return ans ;
    }

    public void helper(int n , int i , List<Integer> ans){
        if(i > n){
            return ;
        }
        ans.add(i) ;
        for(int j = 0 ; j < 10 ; j++){
            helper(n , i * 10 + j , ans) ;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}