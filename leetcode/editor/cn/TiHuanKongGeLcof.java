package leetcode.editor.cn;

//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// 👍 41 👎 0

public class TiHuanKongGeLcof{
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
//     ----------------------------遍历添加-----------------------------------
        /*StringBuffer ans = new StringBuffer() ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                ans.append("%20") ;
            }
            else{
                ans.append(s.charAt(i)) ;
            }
        }
        return ans.toString() ;*/
//     ------------------------------------------------------------------------


//     ---------------------------------API------------------------------------
        //return s.replace(" ", "%20");
//     ------------------------------------------------------------------------
//
//     ---------------------------------双指针----------------------------------

        StringBuffer str = new StringBuffer(s) ;
        //记录空格数目
        int cntBlank = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                cntBlank++ ;
            }
        }

        int newLen = s.length() + cntBlank * 2 ;
        str.setLength(newLen);

        int i = s.length() - 1 ;
        int j = newLen - 1 ;
        while(i >= 0  && i < j){
            if(str.charAt(i) == ' '){
               str.setCharAt(j-- , '0');
               str.setCharAt(j-- , '2');
               str.setCharAt(j-- , '%');
            }
            else{
                str.setCharAt(j-- , str.charAt(i));
            }
            i-- ;
        }

        return str.toString() ;
//     ------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}