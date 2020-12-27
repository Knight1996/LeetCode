package leetcode.editor.cn;

//给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。 
//
// 示例 : 
//
// 输入: [1,2,1,3,2,5]
//输出: [3,5] 
//
// 注意： 
//
// 
// 结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。 
// 你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？ 
// 
// Related Topics 位运算 
// 👍 336 👎 0

public class SingleNumberIii{
    public static void main(String[] args) {
        Solution solution = new SingleNumberIii().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumber(int[] nums) {
//      --------------------------------分组异或---------------------------------
        // 计算所有数字异或的结果ans：
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        // 统计ans中第一个 1 出现的位置：
        int flag = (ans) & (-ans);
        /*int flag = 1;
        while ((flag & ans) == 0) {
            flag <<= 1;
        }*/
        int a = 0, b = 0;
        // 将数据根据 flag 位是 0 或者 1 分成 a , b 两组，分别异或：
        for (int num : nums) {
            if ((flag & num) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}