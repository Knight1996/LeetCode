package leetcode.editor.cn;

//给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。 
//
// 请你将 list1 中第 a 个节点到第 b 个节点删除，并将list2 接在被删除节点的位置。 
//
// 下图中蓝色边和节点展示了操作后的结果： 
//
// 请你返回结果链表的头指针。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
//输出：[0,1,2,1000000,1000001,1000002,5]
//解释：我们删除 list1 中第三和第四个节点，并将 list2 接在该位置。上图中蓝色的边和节点为答案链表。
// 
//
// 示例 2： 
//
// 
//输入：list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,100
//0003,1000004]
//输出：[0,1,1000000,1000001,1000002,1000003,1000004,6]
//解释：上图中蓝色的边和节点为答案链表。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= list1.length <= 104 
// 1 <= a <= b < list1.length - 1 
// 1 <= list2.length <= 104 
// 
// Related Topics 链表 
// 👍 1 👎 0

public class MergeInBetweenLinkedLists{
    public static void main(String[] args) {
        Solution solution = new MergeInBetweenLinkedLists().new Solution();
        
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // 第一部分的头结点head1：
        ListNode head1 = list1 ;
        for(int i = 0 ; i < a - 1 ; i++){
            head1 = head1.next ;
        }

        // 第三部分的头结点head3：
        ListNode head3 = head1.next ;
        for(int i = 0 ; i < b - a + 1 ; i++){
            head3 = head3.next ;
        }

        // 连接第一部分与第二部分：
        head1.next = list2;
        while (head1.next != null){
             head1 = head1.next;
        }
        // 连接第二部分与第三部分：
        head1.next = head3;
        return list1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}