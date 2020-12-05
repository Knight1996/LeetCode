package leetcode.editor.cn;

//森林中，每个兔子都有颜色。其中一些兔子（可能是全部）告诉你还有多少其他的兔子和自己有相同的颜色。我们将这些回答放在 answers 数组里。 
//
// 返回森林中兔子的最少数量。 
//
// 
//示例:
//输入: answers = [1, 1, 2]
//输出: 5
//解释:
//两只回答了 "1" 的兔子可能有相同的颜色，设为红色。
//之后回答了 "2" 的兔子不会是红色，否则他们的回答会相互矛盾。
//设回答了 "2" 的兔子为蓝色。
//此外，森林中还应有另外 2 只蓝色兔子的回答没有包含在数组中。
//因此森林中兔子的最少数量是 5: 3 只回答的和 2 只没有回答的。
//
//输入: answers = [10, 10, 10]
//输出: 11
//
//输入: answers = []
//输出: 0
// 
//
// 说明: 
//
// 
// answers 的长度最大为1000。 
// answers[i] 是在 [0, 999] 范围内的整数。 
// 
// Related Topics 哈希表 数学 
// 👍 42 👎 0

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RabbitsInForest{
    public static void main(String[] args) {
        Solution solution = new RabbitsInForest().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numRabbits(int[] answers) {
//      ---------------------------------哈希表------------------------------------
        if(answers.length == 0){
            return 0 ;
        }
        Map<Integer , Integer> map = new HashMap<>() ;
        int ans = 0 ;
        for(int i = 0 ; i < answers.length ; i++){

            int tem = answers[i];

            // 如果拥有该数量，认为该颜色的兔子已存在：
            if(map.containsKey(tem) && map.get(tem) > 0){
                // 将当前数字减一，之前已经拥有，已经重复：
                map.put(tem,map.get(tem) - 1);
            }
            else{
                // 数量不一样,认为是另一种兔子,计算总和,并放入map:
                ans = ans + tem + 1 ;
                map.put(tem , tem) ;
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}