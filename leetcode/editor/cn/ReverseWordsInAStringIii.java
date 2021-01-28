package leetcode.editor.cn;

//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 
//
// 示例： 
//
// 输入："Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 
//
// 提示： 
//
// 
// 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。 
// 
// Related Topics 字符串 
// 👍 248 👎 0

public class ReverseWordsInAStringIii{
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAStringIii().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
//      --------------------------------双指针-------------------------------------
        int len = s.length() ;
        char[] chars = s.toCharArray();
        int i = 0 ;
        while(i < len){
            int start = i ;
            // 到达第一个子字符串的末尾；
            while(i < len && chars[i] != ' '){
                i++;
            }

            int left = start , right = i - 1 ;
            while(left < right){
                swap(chars , left , right) ;
                left++ ;
                right-- ;
            }
            // 扫过空格:
            while(i < len && chars[i] == ' '){
                i++;
            }
        }
        return new String(chars) ;

//      ---------------------------------------------------------------------------

//      ---------------------------------额外数组-----------------------------------
        /*String[] words = s.split(" ") ;
        StringBuffer ans = new StringBuffer() ;
        for(String str : words){
            ans.append(new StringBuffer(str).reverse());
            ans.append(" ");
        }
        return ans.toString().trim();*/
//      ----------------------------------------------------------------------------
    }

    //交换数组的两个元素
    public void swap(char[] arr , int i , int j){
        char tem = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = tem ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}