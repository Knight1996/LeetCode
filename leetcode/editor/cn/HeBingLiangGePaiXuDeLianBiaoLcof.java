package leetcode.editor.cn;

//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 分治算法 
// 👍 50 👎 0

public class HeBingLiangGePaiXuDeLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
        
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//      -------------------------递归---------------------------
        if(l1 == null){
            return l2 ;
        }
        else if(l2 == null){
            return l1 ;
        }

        ListNode cur = new ListNode(0) ;

        if(l1.val < l2.val){
            cur = l1 ;
            cur.next = mergeTwoLists(l1.next , l2) ;
        }
        else{
            cur = l2 ;
            cur.next = mergeTwoLists(l1 , l2.next) ;
        }
        return cur ;

//      -------------------------循环---------------------------
        /*// 新建头结点：
        ListNode ans = new ListNode(0) ;
        // 遍历的节点：
        ListNode cur = ans ;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1 ;
                l1 = l1.next ;
            }
            else{
                cur.next = l2 ;
                l2 = l2.next ;
            }
            cur = cur.next ;
        }
        if(l1 != null){
            cur.next = l1 ;
        }
        else{
            cur.next = l2 ;
        }
        return ans.next ;*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}