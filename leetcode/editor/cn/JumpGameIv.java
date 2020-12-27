package leetcode.editor.cn;

//给你一个整数数组 arr ，你一开始在数组的第一个元素处（下标为 0）。 
//
// 每一步，你可以从下标 i 跳到下标： 
//
// 
// i + 1 满足：i + 1 < arr.length 
// i - 1 满足：i - 1 >= 0 
// j 满足：arr[i] == arr[j] 且 i != j 
// 
//
// 请你返回到达数组最后一个元素的下标处所需的 最少操作次数 。 
//
// 注意：任何时候你都不能跳到数组外面。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [100,-23,-23,404,100,23,23,23,3,404]
//输出：3
//解释：那你需要跳跃 3 次，下标依次为 0 --> 4 --> 3 --> 9 。下标 9 为数组的最后一个元素的下标。
// 
//
// 示例 2： 
//
// 输入：arr = [7]
//输出：0
//解释：一开始就在最后一个元素处，所以你不需要跳跃。
// 
//
// 示例 3： 
//
// 输入：arr = [7,6,9,6,9,6,9,7]
//输出：1
//解释：你可以直接从下标 0 处跳到下标 7 处，也就是数组的最后一个元素处。
// 
//
// 示例 4： 
//
// 输入：arr = [6,1,9]
//输出：2
// 
//
// 示例 5： 
//
// 输入：arr = [11,22,7,7,7,7,7,7,7,22,13]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 5 * 10^4 
// -10^8 <= arr[i] <= 10^8 
// 
// Related Topics 广度优先搜索 
// 👍 41 👎 0

import java.util.*;

public class JumpGameIv{
    public static void main(String[] args) {
        Solution solution = new JumpGameIv().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minJumps(int[] arr) {
//      ----------------------------------------BFS----------------------------------------------
        int len = arr.length ;
        Map<Integer , List<Integer>> map = new HashMap<>() ;
        int[] distance = new int[len] ;
        for(int i = 0 ; i < len ; i++){
            // public V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
            // 判断缓存MAP中是否存在指定key的值，
            // 如果不存在，会自动调用mappingFunction(key)计算key的value，然后将key = value放入到缓存Map。
            List<Integer> list = map.computeIfAbsent(arr[i] , k -> new ArrayList<>());
            list.add(i);
        }

        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(0);
        int level = 0;

        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                Integer index = deque.removeFirst();
                if (index == arr.length - 1) {
                    return level;
                }
                if (arr[index] == Integer.MAX_VALUE) {
                    continue;
                }
                if (index + 1 < arr.length && arr[index+1] != arr[index]) {
                    deque.addLast(index + 1);
                }
                if (index - 1 >= 0 && arr[index+1] != arr[index]) {
                    deque.addLast(index - 1);
                }
                List<Integer> list = map.get(arr[index]);
                if (list != null) {
                    list.stream().filter(x -> !index.equals(x))
                            .forEach(x -> deque.addLast(x));
                    map.remove(arr[index]);
                }

                arr[index] = Integer.MAX_VALUE;
            }
            level++;
        }
        return level;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}