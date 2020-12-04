package leetcode.editor.cn;

//把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。 
//
// 
//
// 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。 
//
// 
//
// 示例 1: 
//
// 输入: 1
//输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
// 
//
// 示例 2: 
//
// 输入: 2
//输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0
//.05556,0.02778] 
//
// 
//
// 限制： 
//
// 1 <= n <= 11 
// 👍 140 👎 0

public class NgeTouZiDeDianShuLcof{
    public static void main(String[] args) {
        Solution solution = new NgeTouZiDeDianShuLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double[] dicesProbability(int n) {

        double probability = 1/6d ;

        // 1 个骰子 赋初值：
        double[] init = new double[6] ;
        for(int i = 0 ; i < 6 ; i++){
            init[i] = probability ;
        }

        // 第一层循环 表示骰子个数 i :
        for(int i = 2 ; i <= n ; i++){
            // 第二层循环 表示 i 个骰子总共出现情况数，以及每种情况概率：
            // 掷 i 个骰子 会出现 5×i+1 种情况：
            double[] cur = new double[5 * i + 1] ;
            for(int j = 0 ; j < init.length ; j++){
                //第三层循环 计算 当前情况的概率值：
                for(int k = 0 ; k < 6 ; k++){
                    //状态方程：
                    cur[j + k] += init[j] * probability ;
                }
            }
            init = cur ;
        }
        return init ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}