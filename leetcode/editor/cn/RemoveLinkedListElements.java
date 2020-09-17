package leetcode.editor.cn;

//删除链表中等于给定值 val 的所有节点。 
//
// 示例: 
//
// 输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
// 
// Related Topics 链表 
// 👍 442 👎 0

public class RemoveLinkedListElements{
    public static void main(String[] args) {
        Solution solution = new RemoveLinkedListElements().new Solution();
        
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
    public ListNode removeElements(ListNode head, int val) {
//      -----------------------递归-----------------------
        /*if(head == null){
            return null ;
        }
        head.next = removeElements(head.next , val);
        if(head.val == val){
            return head.next ;
        }
        else{
            return head ;
        }*/
//      -----------------------------------------------------

//      ---------------------迭代-----------------------------
        ListNode sentinel = new ListNode(0) ;
        sentinel.next = head ;

        ListNode pre = sentinel ;

        while(pre.next != null){
            if(pre.next.val == val){
                pre.next = pre.next.next ;
            }
            else{
                pre = pre.next;
            }
        }

        return sentinel.next ;
//      ---------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}