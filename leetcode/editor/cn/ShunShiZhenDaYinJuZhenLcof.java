package leetcode.editor.cn;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 
// 👍 151 👎 0

public class ShunShiZhenDaYinJuZhenLcof{
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0] ;
        }

        int rows = matrix.length ;
        int cols = matrix[0].length ;

        int[] ans = new int[rows * cols] ;
        // 全局索引
        int index = 0 ;

        int left = 0 , right = cols - 1 , top = 0 , bottom = rows - 1 ;
        while(left <= right && top <= bottom){
            // 从左到右：
            for(int col = left ; col <= right ; col++){
                ans[index++] = matrix[top][col] ;
            }
            // 从上到下：
            for(int row = top + 1 ; row <= bottom ; row++){
                ans[index++] = matrix[row][right] ;
            }

            if(left < right && top < bottom){
                // 从右到左：
                for(int col = right - 1 ; col > left ; col--){
                    ans[index++] = matrix[bottom][col] ;
                }
                // 从下到上：
                for(int row = bottom ; row > top ; row--){
                    ans[index++] = matrix[row][left] ;
                }
            }
            left++ ;
            right-- ;
            top++ ;
            bottom-- ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}