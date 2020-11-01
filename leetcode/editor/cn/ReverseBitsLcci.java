package leetcode.editor.cn;

//给定一个32位整数 num，你可以将一个数位从0变为1。请编写一个程序，找出你能够获得的最长的一串1的长度。 
//
// 示例 1： 
//
// 输入: num = 1775(110111011112)
//输出: 8
// 
//
// 示例 2： 
//
// 输入: num = 7(01112)
//输出: 4
// 
// Related Topics 位运算 
// 👍 20 👎 0

public class ReverseBitsLcci{
    public static void main(String[] args) {
        Solution solution = new ReverseBitsLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverseBits(int num) {
        //单独考虑 -1 情况   全为 1
        if(num == -1){
            return 32 ;
        }

        int maxLen = 0 , curLen = 0 , preLen = 0 , bits = 32 ;

        while(bits > 0){
            if((1 & num) == 1){
                curLen++ ;
            }
            else{
                maxLen = Math.max(maxLen , curLen + preLen + 1) ;
                preLen = curLen ;
                curLen = 0 ;
            }
            num >>= 1 ;
            bits-- ;
        }

        return Math.max(maxLen , curLen + preLen + 1) ;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}