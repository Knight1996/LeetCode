package leetcode.editor.cn;

//栈排序。 编写程序，对栈进行排序使最小元素位于栈顶。最多只能使用一个其他的临时栈存放数据，但不得将元素复制到别的数据结构（如数组）中。该栈支持如下操作：pu
//sh、pop、peek 和 isEmpty。当栈为空时，peek 返回 -1。 
//
// 示例1: 
//
//  输入：
//["SortedStack", "push", "push", "peek", "pop", "peek"]
//[[], [1], [2], [], [], []]
// 输出：
//[null,null,null,1,null,2]
// 
//
// 示例2: 
//
//  输入： 
//["SortedStack", "pop", "pop", "push", "pop", "isEmpty"]
//[[], [], [], [1], [], []]
// 输出：
//[null,null,null,null,null,true]
// 
//
// 说明: 
//
// 
// 栈中的元素数目在[0, 5000]范围内。 
// 
// Related Topics 设计 
// 👍 31 👎 0

import java.util.Stack;

public class SortOfStacksLcci{
    public static void main(String[] args) {
        Solution solution = new SortOfStacksLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class SortedStack {

    Stack<Integer> stack = new Stack<>() ;
    Stack<Integer> sup = new Stack<>() ;

    public SortedStack() {

    }
    
    public void push(int val) {
        while(!stack.isEmpty() && stack.peek() < val){
            sup.push(stack.pop()) ;
        }
        stack.push(val) ;
        while(!sup.isEmpty()){
            stack.push(sup.pop()) ;
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop() ;
        }
    }
    
    public int peek() {
        if(!stack.isEmpty()){
            return stack.peek() ;
        }
        else{
            return -1 ;
        }
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

/**
 * Your SortedStack object will be instantiated and called as such:
 * SortedStack obj = new SortedStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.isEmpty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}