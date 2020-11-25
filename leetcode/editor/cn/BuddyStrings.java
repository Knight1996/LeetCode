package leetcode.editor.cn;

//给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。 
//
// 交换字母的定义是取两个下标 i 和 j （下标从 0 开始），只要 i!=j 就交换 A[i] 和 A[j] 处的字符。例如，在 "abcd" 中交换下标
// 0 和下标 2 的元素可以生成 "cbad" 。 
//
// 
//
// 示例 1： 
//
// 
//输入： A = "ab", B = "ba"
//输出： true
//解释： 你可以交换 A[0] = 'a' 和 A[1] = 'b' 生成 "ba"，此时 A 和 B 相等。 
//
// 示例 2： 
//
// 
//输入： A = "ab", B = "ab"
//输出： false
//解释： 你只能交换 A[0] = 'a' 和 A[1] = 'b' 生成 "ba"，此时 A 和 B 不相等。
// 
//
// 示例 3: 
//
// 
//输入： A = "aa", B = "aa"
//输出： true
//解释： 你可以交换 A[0] = 'a' 和 A[1] = 'a' 生成 "aa"，此时 A 和 B 相等。 
//
// 示例 4： 
//
// 
//输入： A = "aaaaaaabc", B = "aaaaaaacb"
//输出： true
// 
//
// 示例 5： 
//
// 
//输入： A = "", B = "aa"
//输出： false
// 
//
// 
//
// 提示： 
//
// 
// 0 <= A.length <= 20000 
// 0 <= B.length <= 20000 
// A 和 B 仅由小写字母构成。 
// 
// Related Topics 字符串 
// 👍 118 👎 0

public class BuddyStrings{
    public static void main(String[] args) {
        Solution solution = new BuddyStrings().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean buddyStrings(String A, String B) {
//      --------------------------分情况讨论--------------------------------
        // 情况一：长度不相等，直接false：
        if(A.length() != B.length()){
            return false ;
        }
        // 情况二：A与B相等,A(B)中有相同的字符，则为true：
        if(A.equals(B)){
            for(int i = 0 ; i < A.length() - 1 ; i++){
                // int indexOf(String str, int startIndex)：
                // 从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。
                if(A.indexOf(A.charAt(i),i + 1) != -1){
                    return true ;
                }
            }
            return false ;
        }
        // 情况三：找出两个不同元素的下标：
        int index1 = -1 ,index2 = -1 , cnt = 0 ;
        for(int i = 0 ; i < A.length() ; i++){
            if(A.charAt(i) != B.charAt(i)){
                cnt++ ;
                if(cnt == 1){
                    index1 = i ;
                }
                else if(cnt == 2){
                    index2 = i ;
                }
                else{
                    return false ;
                }
            }
        }
        return cnt == 2
                && A.charAt(index1) == B.charAt(index2)
                && A.charAt(index2) == B.charAt(index1) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}