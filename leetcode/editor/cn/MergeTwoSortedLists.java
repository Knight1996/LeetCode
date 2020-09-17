package leetcode.editor.cn;

//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表 
// 👍 1260 👎 0

public class MergeTwoSortedLists{
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ----------------------递归---------------------
        /*if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next , l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l2.next , l1);
            return l2;
        }*/
//        ------------------------------------------------

//        ---------------------迭代------------------------
        ListNode preHead = new ListNode(-1) ;
        ListNode pre = preHead ;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                pre.next = l1 ;
                l1 = l1.next ;
            }
            else{
                pre.next = l2 ;
                l2 = l2.next ;
            }
            pre = pre.next ;
        }

        if(l1 == null){
            pre.next = l2 ;
        }else{
            pre.next = l1 ;
        }
        return preHead.next ;
//        -----------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}