package leetcode.editor.cn;

//在一个由 'L' , 'R' 和 'X' 三个字符组成的字符串（例如"RXXLRXRXL"）中进行移动操作。一次移动操作指用一个"LX"替换一个"XL"，或
//者用一个"XR"替换一个"RX"。现给定起始字符串start和结束字符串end，请编写代码，当且仅当存在一系列移动操作使得start可以转换成end时， 返回T
//rue。 
//
// 
//
// 示例 : 
//
// 输入: start = "RXXLRXRXL", end = "XRLXXRRLX"
//输出: True
//解释:
//我们可以通过以下几步将start转换成end:
//RXXLRXRXL ->
//XRXLRXRXL ->
//XRLXRXRXL ->
//XRLXXRRXL ->
//XRLXXRRLX
// 
//
// 
//
// 提示： 
//
// 
// 1 <= len(start) = len(end) <= 10000。 
// start和end中的字符串仅限于'L', 'R'和'X'。 
// 
// Related Topics 脑筋急转弯 
// 👍 63 👎 0

public class SwapAdjacentInLrString{
    public static void main(String[] args) {
        Solution solution = new SwapAdjacentInLrString().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canTransform(String start, String end) {
        int len = start.length() ;
        int i = 0 , j = 0 ;
        while(true){
            while(i < len && start.charAt(i) == 'X'){
                i++ ;
            }
            while(j < len && end.charAt(j) == 'X'){
                j++ ;
            }

            if(i == len && j == len){
                return true ;
            }
            if(i == len || j == len || start.charAt(i) != end.charAt(j)){
                return false ;
            }
            //第 n 个 'L' 不可能移动到初始位置的右边
            if(start.charAt(i) == 'L' && i < j){
                return false ;
            }
            //第 n 个 'R' 不可能移动到初始位置的左边
            if(end.charAt(j) == 'R' && i > j){
                return false ;
            }
            i++ ;
            j++ ;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}