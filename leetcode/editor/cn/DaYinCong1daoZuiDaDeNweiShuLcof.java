package leetcode.editor.cn;

//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。 
//
// 示例 1: 
//
// 输入: n = 1
//输出: [1,2,3,4,5,6,7,8,9]
// 
//
// 
//
// 说明： 
//
// 
// 用返回一个整数列表来代替打印 
// n 为正整数 
// 
// Related Topics 数学 
// 👍 58 👎 0

public class DaYinCong1daoZuiDaDeNweiShuLcof{
    public static void main(String[] args) {
        Solution solution = new DaYinCong1daoZuiDaDeNweiShuLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    int[] ans ;
    int nine = 0 ;
    int cnt = 0 ;
    int start = 0 ;
    int n = 0 ;
    char[] num , loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'} ;

    public int[] printNumbers(int n) {
//      -------------------------------暴力-----------------------------------
        /*int len = (int)Math.pow(10 , n) - 1 ;
        int[] ans = new int[len] ;
        for(int i = 0 ; i < len ; i++){
            ans[i] = i + 1 ;
        }

        return ans ;*/

//      ---------------------------大数打印-----------------------------
        this.n = n ;
        ans = new int[(int)Math.pow(10 , n) - 1] ;
        num = new char[n] ;
        start = n - 1 ;
        dfs(0) ;
        return ans ;
    }

    public void dfs(int x){
        if(x == n){
            String str = String.valueOf(num).substring(start) ;
            if(!str.equals("0")){
                ans[cnt++] = Integer.parseInt(str) ;
            }
            if(n - start == nine){
                start-- ;
            }
            return ;
        }
        for(char ch : loop){
            if(ch == '9'){
                nine++;
            }
            num[x] = ch ;
            dfs(x + 1) ;
        }
        nine-- ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}