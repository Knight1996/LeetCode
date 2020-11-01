package leetcode.editor.cn;

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 链表 
// 👍 62 👎 0


import java.util.ArrayList;
import java.util.Stack;

public class CongWeiDaoTouDaYinLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        
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

//    ArrayList<Integer> list = new ArrayList<>() ;

    public int[] reversePrint(ListNode head) {
//     ---------------------------栈----------------------------------
        Stack<ListNode> stack = new Stack<ListNode>() ;
        ListNode pNode = head ;
        while(pNode != null){
            stack.push(pNode) ;
            pNode = pNode.next ;
        }

        int len = stack.size() ;
        int[] ans = new int[len] ;
        for(int i = 0 ; i < len ; i++){
            ans[i] = stack.pop().val ;
        }

        return ans ;
//      ------------------------------------------------------------------

//      ---------------------------递归------------------------------------
        /*helper(head) ;
        int[] ans = new int[list.size()] ;
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = list.get(i) ;
        }
        return ans ;*/
//      -------------------------------------------------------------------
    }

    /*void helper(ListNode head){
        if(head == null){
            return ;
        }
        helper(head.next) ;
        list.add(head.val) ;
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}