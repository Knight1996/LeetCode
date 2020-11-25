package leetcode.editor.cn;

//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 链表 
// 👍 128 👎 0

public class FanZhuanLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new FanZhuanLianBiaoLcof().new Solution();
        
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
    public ListNode reverseList(ListNode head) {
//      -------------------------------双指针-----------------------------
        /*ListNode flagNode = null ;
        ListNode pNode = head ;
        ListNode pPre = null ;

        while(pNode != null){
            ListNode pNext = pNode.next ;
            if(pNext == null){
                flagNode = pNode ;
            }
            pNode.next = pPre ;
            pPre = pNode ;
            pNode = pNext ;
        }

        return flagNode ;*/
//      ------------------------------------------------------------------

//      ------------------------------递归---------------------------------
        return helper(head , null) ;
    }

    ListNode helper(ListNode cur , ListNode pre){
        if(cur == null){
            return pre ;
        }
        ListNode ans = helper(cur.next , cur) ;
        cur.next = pre ;
        return ans ;
    }
//      --------------------------------------------------------------------
}
//leetcode submit region end(Prohibit modification and deletion)

}