package leetcode.editor.cn;

//输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。 
//
// 
//
// 示例 1: 
//
// 输入: [10,2]
//输出: "102" 
//
// 示例 2: 
//
// 输入: [3,30,34,5,9]
//输出: "3033459" 
//
// 
//
// 提示: 
//
// 
// 0 < nums.length <= 100 
// 
//
// 说明: 
//
// 
// 输出结果可能非常大，所以你需要返回一个字符串而不是整数 
// 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0 
// 
// Related Topics 排序 
// 👍 128 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaShuZuPaiChengZuiXiaoDeShuLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZuPaiChengZuiXiaoDeShuLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minNumber(int[] nums) {
        // 将数字数组 转化成 字符串数组
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        // 自定义排列规则排序
        // 若 x + y > y + x  则 x > y ;  x, y: String类型
        Arrays.sort(str, (x, y) -> (x + y).compareTo(y + x));

        StringBuilder ans = new StringBuilder();
        for(String s : str){
            ans.append(s);
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}