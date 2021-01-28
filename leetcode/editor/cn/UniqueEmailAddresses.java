package leetcode.editor.cn;

//每封电子邮件都由一个本地名称和一个域名组成，以 @ 符号分隔。 
//
// 例如，在 alice@leetcode.com中， alice 是本地名称，而 leetcode.com 是域名。 
//
// 除了小写字母，这些电子邮件还可能包含 '.' 或 '+'。 
//
// 如果在电子邮件地址的本地名称部分中的某些字符之间添加句点（'.'），则发往那里的邮件将会转发到本地名称中没有点的同一地址。例如，"alice.z@leet
//code.com” 和 “alicez@leetcode.com” 会转发到同一电子邮件地址。 （请注意，此规则不适用于域名。） 
//
// 如果在本地名称中添加加号（'+'），则会忽略第一个加号后面的所有内容。这允许过滤某些电子邮件，例如 m.y+name@email.com 将转发到 my@
//email.com。 （同样，此规则不适用于域名。） 
//
// 可以同时使用这两个规则。 
//
// 给定电子邮件列表 emails，我们会向列表中的每个地址发送一封电子邮件。实际收到邮件的不同地址有多少？ 
//
// 
//
// 示例： 
//
// 输入：["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","test
//email+david@lee.tcode.com"]
//输出：2
//解释：实际收到邮件的是 "testemail@leetcode.com" 和 "testemail@lee.tcode.com"。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= emails[i].length <= 100 
// 1 <= emails.length <= 100 
// 每封 emails[i] 都包含有且仅有一个 '@' 字符。 
// 
// Related Topics 字符串 
// 👍 143 👎 0

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses{
    public static void main(String[] args) {
        Solution solution = new UniqueEmailAddresses().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numUniqueEmails(String[] emails) {
//      ----------------------------------模拟 + Set-----------------------------------
        Set<String> set = new HashSet<>() ;
        for(String s : emails){
            int index = s.indexOf('@') ;
            String s1 = s.substring(0 , index) ;
            String s2 = s.substring(index) ;
            if(s1.contains("+")){
                s1 = s1.substring(0 , s1.indexOf('+')) ;
            }
            s1 = s1.replaceAll("\\." , "") ;
            set.add(s1 + s2) ;
        }
        return set.size() ;
//      ----------------------------------------------------------------------------

//      --------------------------------splict() + Set------------------------------
        /*Set<String> set = new HashSet<>() ;
        for(String s : emails){
            String[] arr = s.split("@") ;
            if(arr[0].contains("+")){
                arr[0] = arr[0].substring(0 , arr[0].indexOf('+')) ;
            }
            arr[0] = arr[0].replaceAll("\\." , "") ;
            set.add(arr[0] + '@' + arr[1]) ;
        }
        return set.size() ;*/
//      -----------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}