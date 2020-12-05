package leetcode.editor.cn;

//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
// 
//
// 示例 2： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 100] 内 
// 0 <= Node.val <= 100 
// 
// Related Topics 链表 
// 👍 754 👎 0

public class SwapNodesInPairs{
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
        
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
    public ListNode swapPairs(ListNode head) {
//      -------------------------------递归-----------------------------------
       /* // 递归终止条件：链表剩余 1 个节点 或 0 个节点：
        if(head == null || head.next == null){
            return head ;
        }
        ListNode newHead = head.next ;
        head.next = swapPairs(newHead.next) ;
        newHead.next = head ;
        return newHead ;*/
//      -----------------------------------------------------------------------

//      ----------------------------------迭代---------------------------------
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode tem = preHead;
        while (tem.next != null && tem.next.next != null) {

            ListNode node1 = tem.next;
            ListNode node2 = tem.next.next;
            // 交换：
            tem.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            tem = node1;
        }
        return preHead.next;
//      -----------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}