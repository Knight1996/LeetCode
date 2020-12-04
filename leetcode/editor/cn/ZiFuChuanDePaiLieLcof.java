package leetcode.editor.cn;

//输入一个字符串，打印出该字符串中字符的所有排列。 
//
// 
//
// 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。 
//
// 
//
// 示例: 
//
// 输入：s = "abc"
//输出：["abc","acb","bac","bca","cab","cba"]
// 
//
// 
//
// 限制： 
//
// 1 <= s 的长度 <= 8 
// Related Topics 回溯算法 
// 👍 140 👎 0

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ZiFuChuanDePaiLieLcof{
    public static void main(String[] args) {
        Solution solution = new ZiFuChuanDePaiLieLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<String> ans = new LinkedList<>() ;
    char[] c ;

    public String[] permutation(String s) {
//      -------------------------回溯法 + 剪枝------------------------------
        c = s.toCharArray() ;
        dfs(0) ;
        return ans.toArray(new String[ans.size()]);
    }

    public void dfs(int num){
        if(num == c.length - 1){
            ans.add(String.valueOf(c)) ;
            return ;
        }
        // 若 c[i] 在 Set 内，重复字符，剪枝：
        HashSet<Character> set = new HashSet<>() ;
        for(int i = num ; i < c.length ; i++){
            if(set.contains(c[i])){
                continue ;
            }
            set.add(c[i]) ;
            swap(i , num) ;
            dfs(num + 1) ;
            swap(i , num) ;
        }
    }

    public void swap(int a , int b){
        char tem = c[a] ;
        c[a] = c[b] ;
        c[b] = tem ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}