package leetcode.editor.cn;

//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。 
//
// 
//
// 为了让您更好地理解问题，以下面的二叉搜索树为例： 
//
// 
//
// 
//
// 
//
// 我们希望将这个二叉搜索树转化为双向循环链表。链表中的每个节点都有一个前驱和后继指针。对于双向循环链表，第一个节点的前驱是最后一个节点，最后一个节点的后继是
//第一个节点。 
//
// 下图展示了上面的二叉搜索树转化成的链表。“head” 表示指向链表中有最小元素的节点。 
//
// 
//
// 
//
// 
//
// 特别地，我们希望可以就地完成转换操作。当转化完成以后，树中节点的左指针需要指向前驱，树中节点的右指针需要指向后继。还需要返回链表中的第一个节点的指针。 
//
// 
//
// 注意：本题与主站 426 题相同：https://leetcode-cn.com/problems/convert-binary-search-tree-
//to-sorted-doubly-linked-list/ 
//
// 注意：此题对比原题有改动。 
// Related Topics 分治算法 
// 👍 130 👎 0

public class ErChaSouSuoShuYuShuangXiangLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuYuShuangXiangLianBiaoLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {

    Node pre ;
    Node head ;

    public Node treeToDoublyList(Node root) {
        if(root == null){
            return null ;
        }
        dfs(root) ;

        //进行头节点 head 和尾节点 pre 的 相互指向:
        pre.right = head;
        head.left = pre;

        return head ;
    }

    public void dfs(Node node){
        if(node == null){
            return ;
        }
        dfs(node.left) ;
        // pre 用于记录双向链表中位于 node 左侧的节点，即上一次迭代中的 node
        if(pre != null){
            //当 pre!=null时，node 左侧存在节点 pre ，需要进行 pre.right = node 的操作
            pre.right = node ;
        }
        else{
            // 当 pre == null 时，node 左侧没有节点,即此时 node 为双向链表中的头节点
            head = node ;        // node 为 头节点
        }
        node.left = pre ;
        // pre指向当前的 node
        pre = node ;
        // 全部迭代完成后，pre指向双向链表中的尾节点
        dfs(node.right) ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}