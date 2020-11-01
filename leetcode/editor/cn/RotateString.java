package leetcode.editor.cn;

//给定两个字符串, A 和 B。 
//
// A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后
//，A 能变成B，那么返回True。 
//
// 
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
//
//示例 2:
//输入: A = 'abcde', B = 'abced'
//输出: false 
//
// 注意： 
//
// 
// A 和 B 长度不超过 100。 
// 
// 👍 106 👎 0

public class RotateString{
    public static void main(String[] args) {
        Solution solution = new RotateString().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean rotateString(String A, String B) {
//      ------------------------判断子串--------------------------------
        //return A.length() == B.length() && (A + A).contains(B) ;
//        ---------------------------------------------------------------

//      ----------------------------暴力--------------------------------
        if(A.length() != B.length()){
            return false ;
        }
        if(A.length() == 0){
            return true ;
        }

        for(int i = 0 ; i < A.length() ; i++){
            if(A.charAt(i) == B.charAt(0)){
                String str1 = A.substring(0 , i) ;
                String str2 = A.substring(i) ;
                String str = str2 + str1 ;
                if(str.equals(B)){
                    return true ;
                }
            }
        }
        return false ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}