package leetcode.editor.cn;

//请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(
//1)。 示例： MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
// minStack.push(-3); minStack.getMin();   --> 返回 -3. minStack.pop(); minStack.top
//();      --> 返回 0. minStack.getMin();   --> 返回 -2. Related Topics 栈 
// 👍 32 👎 0

import java.util.Deque;
import java.util.LinkedList;

public class MinStackLcci{
    public static void main(String[] args) {
        Solution solution = new MinStackLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

    Deque<Integer> supStack ;
    Deque<Integer> minStack ;

    /** initialize your data structure here. */
    public MinStack() {
        supStack = new LinkedList<>() ;
        minStack = new LinkedList<>() ;
        minStack.push(Integer.MAX_VALUE) ;
    }
    
    public void push(int x) {
        supStack.push(x) ;
        minStack.push(Math.min(x , minStack.peek())) ;
    }
    
    public void pop() {
        supStack.pop() ;
        minStack.pop() ;
    }
    
    public int top() {
        return supStack.peek() ;
    }
    
    public int getMin() {
        return minStack.peek() ;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}