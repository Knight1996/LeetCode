package leetcode.editor.cn;

//0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。 
//
// 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。 
//
// 
//
// 示例 1： 
//
// 输入: n = 5, m = 3
//输出: 3
// 
//
// 示例 2： 
//
// 输入: n = 10, m = 17
//输出: 2
// 
//
// 
//
// 限制： 
//
// 
// 1 <= n <= 10^5 
// 1 <= m <= 10^6 
// 
// 👍 223 👎 0

import java.util.ArrayList;
import java.util.LinkedList;

public class YuanQuanZhongZuiHouShengXiaDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new YuanQuanZhongZuiHouShengXiaDeShuZiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastRemaining(int n, int m) {
//     ------------------------迭代-----------------------------
        int pos = 0 ;  // 最后幸存的元素索引为 0 ：
        for(int i = 2 ; i <= n ; i++){
            pos = (pos + m) % i ;
        }
        return pos ;
//      -----------------------递归-----------------------------
       /* if(n < 1 || m < 1){
            return -1 ;
        }
        if(n == 1){
            return 0 ;
        }
        return (lastRemaining(n - 1 , m) + m) % n ;*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}