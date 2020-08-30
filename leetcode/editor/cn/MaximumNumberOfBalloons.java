package leetcode.editor.cn;

//给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。 
//
// 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：text = "nlaebolko"
//输出：1
// 
//
// 示例 2： 
//
// 
//
// 输入：text = "loonbalxballpoon"
//输出：2
// 
//
// 示例 3： 
//
// 输入：text = "leetcode"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= text.length <= 10^4 
// text 全部由小写英文字母组成 
// 
// Related Topics 哈希表 字符串 
// 👍 41 👎 0

public class MaximumNumberOfBalloons{
    public static void main(String[] args) {
        Solution solution = new MaximumNumberOfBalloons().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text.length() == 0){
            return 0 ;
        }

        char[] chars = text.toCharArray() ;
        int b = 0 ;
        int a = 0 ;
        int l = 0 ;
        int o = 0 ;
        int n = 0 ;

        for(char c : chars){
            if(c == 'b'){
                b++;
            }
            else if(c == 'a'){
                a++;
            }
            else if(c == 'l'){
                l++;
            }
            else if(c == 'o'){
                o++;
            }
            else{
                n++;
            }
        }
        return Math.min( Math.min( Math.min(b , a) , Math.min(l/2 , o/2)) , n ) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}