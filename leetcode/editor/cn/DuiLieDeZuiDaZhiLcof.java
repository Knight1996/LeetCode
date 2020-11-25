package leetcode.editor.cn;

//请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都
//是O(1)。 
//
// 若队列为空，pop_front 和 max_value 需要返回 -1 
//
// 示例 1： 
//
// 输入: 
//["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
//[[],[1],[2],[],[],[]]
//输出: [null,null,null,2,1,2]
// 
//
// 示例 2： 
//
// 输入: 
//["MaxQueue","pop_front","max_value"]
//[[],[],[]]
//输出: [null,-1,-1]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= push_back,pop_front,max_value的总操作数 <= 10000 
// 1 <= value <= 10^5 
// 
// Related Topics 栈 Sliding Window 
// 👍 163 👎 0

import java.util.Deque;
import java.util.LinkedList;

public class DuiLieDeZuiDaZhiLcof{
    public static void main(String[] args) {
        Solution solution = new DuiLieDeZuiDaZhiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class MaxQueue {
//    ------------------------------双端队列--------------------------------
    private Deque<Integer> deque ;    //原始队列
    private Deque<Integer> max ;      //辅助队列 保存队列当前最大值
    public MaxQueue() {
        deque = new LinkedList<>() ;
        max = new LinkedList<>() ;
    }
    
    public int max_value() {
        if(max.isEmpty()){
            return -1 ;
        }
        return max.getFirst() ;
    }
    
    public void push_back(int value) {
        deque.add(value) ;
        // value 的值 大于 max 的队尾元素，队尾元素出队 ，
        // 辅助队列 max 队首元素就是队列的最大值
        while(!max.isEmpty() && value > max.peekLast()){
            max.removeLast() ;
        }
        max.addLast(value);
    }
    
    public int pop_front() {
        if(deque.isEmpty()){
            return -1 ;
        }
        int tem = deque.remove() ;
        if(tem == max.peekFirst()){
            max.removeFirst() ;
        }
        return tem ;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
//leetcode submit region end(Prohibit modification and deletion)

}