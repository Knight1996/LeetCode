package leetcode.editor.cn;

//二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。 
//
// 每个 LED 代表一个 0 或 1，最低位在右侧。 
//
// 
//
// 例如，上面的二进制手表读取 “3:25”。 
//
// 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。 
//
// 
//
// 示例： 
//
// 输入: n = 1
//返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "
//0:32"] 
//
// 
//
// 提示： 
//
// 
// 输出的顺序没有要求。 
// 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。 
// 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。 
// 超过表示范围（小时 0-11，分钟 0-59）的数据将会被舍弃，也就是说不会出现 "13:00", "0:61" 等时间。 
// 
// Related Topics 位运算 回溯算法 
// 👍 228 👎 0

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch{
    public static void main(String[] args) {
        Solution solution = new BinaryWatch().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> readBinaryWatch(int num) {
        // Integer.bitCount(): 统计 int 值所对应的二进制中 1 的个数
        List<String> ans = new ArrayList<>() ;

        for(int i = 0 ; i < 12 ; i++){
            for(int j = 0 ; j < 60 ; j++){
                int cnt = Integer.bitCount(i) + Integer.bitCount(j) ;// 核心
                if(cnt == num){
                    StringBuffer s = new StringBuffer() ;
                    s.append(i).append(':') ;
                    if(j < 10){
                        s.append('0') ;
                    }
                    s.append(j) ;
                    ans.add(s.toString()) ;
                }
            }
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}