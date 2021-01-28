package leetcode.editor.cn;

//给定一组字符，使用原地算法将其压缩。 
//
// 压缩后的长度必须始终小于或等于原数组长度。 
//
// 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。 
//
// 在完成原地修改输入数组后，返回数组的新长度。 
//
// 
//
// 进阶： 
//你能否仅使用O(1) 空间解决问题？ 
//
// 
//
// 示例 1： 
//
// 输入：
//["a","a","b","b","c","c","c"]
//
//输出：
//返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
//
//说明：
//"aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
// 
//
// 示例 2： 
//
// 输入：
//["a"]
//
//输出：
//返回 1 ，输入数组的前 1 个字符应该是：["a"]
//
//解释：
//没有任何字符串被替代。
// 
//
// 示例 3： 
//
// 输入：
//["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//
//输出：
//返回 4 ，输入数组的前4个字符应该是：["a","b","1","2"]。
//
//解释：
//由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
//注意每个数字在数组中都有它自己的位置。
// 
//
// 
//
// 提示： 
//
// 
// 所有字符都有一个ASCII值在[35, 126]区间内。 
// 1 <= len(chars) <= 1000。 
// 
// Related Topics 字符串 
// 👍 152 👎 0

public class StringCompression{
    public static void main(String[] args) {
        Solution solution = new StringCompression().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int compress(char[] chars) {
//      -------------------------------模拟 + 拼接------------------------------------
        StringBuffer str = new StringBuffer() ;
        int i = 0 ; // 遍历指针：
        while(i < chars.length){
            int cnt = 1 ; // 计数标志
            while(i < chars.length - 1 && chars[i] == chars[i + 1]){
                i++ ;
                cnt++ ;
            }
            // 该字符仅有一个，不需要加cnt:
            if(cnt == 1){
                str.append(chars[i]) ;
            }
            // 该字符超过一个，需要加cnt:
            else if(cnt > 1){
                str.append(chars[i]) ;
                str.append(cnt) ;
            }
            i++ ;
        }

        // 将两位数转化为两个字符：
        // 先转化为字符串，再转化为数组：
        char[] arr = str.toString().toCharArray() ;
        for(int j = 0 ; j < arr.length ; j++){
            chars[j] = arr[j] ;
        }
        return arr.length;
//      -----------------------------------------------------------------------------

//      ----------------------------------双指针--------------------------------------
        /*int cur = 0 ;
        for(int start = 0 , end = 0 ; start < chars.length ; start = end){
            while(end < chars.length && chars[start] == chars[end]){
                end++ ;
            }
            chars[cur++] = chars[start] ;
            if(end - start == 1){
                continue ;
            }
            char[] arr= String.valueOf(end - start).toCharArray() ;
            for(char c : arr){
                chars[cur++] = c ;
            }
        }
        return cur ;*/
//      -------------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}