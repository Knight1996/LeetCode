package leetcode.editor.cn;

//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。 
//
// 示例 1： 
//
// 输入: s = "leetcode"
//输出: false 
// 
//
// 示例 2： 
//
// 输入: s = "abc"
//输出: true
// 
//
// 限制： 
// 
// 0 <= len(s) <= 100 
// 如果你不使用额外的数据结构，会很加分。 
// 
// Related Topics 数组 
// 👍 57 👎 0

public class IsUniqueLcci{
    public static void main(String[] args) {
        Solution solution = new IsUniqueLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isUnique(String astr) {
        if(astr.length() == 0 || astr.length() == 1){
            return true ;
        }
        boolean flag = true ;
        for(int i = 0 ; i < astr.length() ; i++){
            if(astr.indexOf(astr.charAt(i)) != astr.lastIndexOf(astr.charAt(i))){
                flag = false ;
            }
        }
        return flag ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}