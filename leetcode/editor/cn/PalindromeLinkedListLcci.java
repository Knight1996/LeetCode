package leetcode.editor.cn;

//编写一个函数，检查输入的链表是否是回文的。 
//
// 
//
// 示例 1： 
//
// 输入： 1->2
//输出： false 
// 
//
// 示例 2： 
//
// 输入： 1->2->2->1
//输出： true 
// 
//
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 
// 👍 34 👎 0

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedListLcci{
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedListLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
//      ---------------------------List--------------------------------
       /*List<Integer> list = new ArrayList<>() ;

        ListNode cur = head ;

        while(cur != null){
            list.add(cur.val) ;
            cur = cur.next ;
        }

        int left = 0 ;
        int right = list.size() - 1 ;

        while(left < right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++ ;
            right-- ;
        }
        return true ;*/
//      -------------------------------------------------------------

//      -------------------------------------------------------------
        int len = 0 ;
        ListNode cur = head ;
        while(cur != null){
            cur = cur.next ;
            len++ ;
        }
        Stack<ListNode> stack = new Stack<>() ;
        cur = head ;
        for(int i = 0 ; i < len/2 ; i++){
            stack.add(cur) ;
            cur = cur.next ;
        }
        if((len&1) == 1){
            cur = cur.next ;
        }
        for(int i = 0 ; i < len/2 ; i++){
            if(stack.pop().val != cur.val){
                return false ;
            }
            cur = cur.next ;
        }
        return true ;
//      -------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}