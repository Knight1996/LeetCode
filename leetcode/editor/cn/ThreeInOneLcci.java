package leetcode.editor.cn;

//三合一。描述如何只用一个数组来实现三个栈。 
//
// 你应该实现push(stackNum, value)、pop(stackNum)、isEmpty(stackNum)、peek(stackNum)方法。s
//tackNum表示栈下标，value表示压入的值。 
//
// 构造函数会传入一个stackSize参数，代表每个栈的大小。 
//
// 示例1: 
//
//  输入：
//["TripleInOne", "push", "push", "pop", "pop", "pop", "isEmpty"]
//[[1], [0, 1], [0, 2], [0], [0], [0], [0]]
// 输出：
//[null, null, null, 1, -1, -1, true]
//说明：当栈为空时`pop, peek`返回-1，当栈满时`push`不压入元素。
// 
//
// 示例2: 
//
//  输入：
//["TripleInOne", "push", "push", "push", "pop", "pop", "pop", "peek"]
//[[2], [0, 1], [0, 2], [0, 3], [0], [0], [0], [0]]
// 输出：
//[null, null, null, null, 2, 1, -1, -1]
// 
// Related Topics 设计 
// 👍 26 👎 0

public class ThreeInOneLcci{
    public static void main(String[] args) {
        Solution solution = new ThreeInOneLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class TripleInOne {

    int[] stack ; // 栈数组
    int size ; // 记录栈的大小
    int[] index = new int[3]; //记录该栈的栈顶索引位置

    public TripleInOne(int stackSize) {
        this.size = stackSize ;
        stack = new int[size * 3] ;
        for(int i = 0 ; i < 3 ; i++){
            index[i] = i * size ; // 初始栈索引位置：
        }
    }

    // 入栈：判断栈是否已满，即当前索引是否是栈终点
    public void push(int stackNum, int value) {
        // 判断栈未满：
        if(index[stackNum] < (stackNum + 1) * size){
            stack[index[stackNum]] = value ;
            index[stackNum]++ ;
        }
    }

    // 出栈：判断栈是否为空，即当前索引是否是栈起点
    public int pop(int stackNum) {
        // 判断栈不空：
        if(index[stackNum] > stackNum* size){
            index[stackNum]-- ;
            return stack[index[stackNum]] ;
        }
        return -1;
    }
    
    public int peek(int stackNum) {
        if(index[stackNum] > stackNum* size){
            return stack[index[stackNum] - 1] ;
        }
        else{
            return -1 ;
        }
    }
    
    public boolean isEmpty(int stackNum) {
        return index[stackNum] == stackNum* size ;
    }
}

/**
 * Your TripleInOne object will be instantiated and called as such:
 * TripleInOne obj = new TripleInOne(stackSize);
 * obj.push(stackNum,value);
 * int param_2 = obj.pop(stackNum);
 * int param_3 = obj.peek(stackNum);
 * boolean param_4 = obj.isEmpty(stackNum);
 */
//leetcode submit region end(Prohibit modification and deletion)

}