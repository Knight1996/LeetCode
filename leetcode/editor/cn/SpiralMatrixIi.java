package leetcode.editor.cn;

//给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。 
//
// 示例: 
//
// 输入: 3
//输出:
//[
// [ 1, 2, 3 ],
// [ 8, 9, 4 ],
// [ 7, 6, 5 ]
//] 
// Related Topics 数组 
// 👍 269 👎 0

public class SpiralMatrixIi{
    public static void main(String[] args) {
        Solution solution = new SpiralMatrixIi().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {

        // 划定边界：
        int left = 0 , right = n - 1 , top = 0 , buttom = n - 1 ;
        int[][] mat = new int[n][n] ;
        int num = 1 , tar = n * n ;

        while(num <= tar){
            // 从左到右：
            for(int i = left ; i <= right ; i++){
                mat[top][i] = num++ ;
            }
            top++ ;
            // 从上到下：
            for(int i = top ; i <= buttom ; i++){
                mat[i][right] = num++ ;
            }
            right-- ;
            // 从右到左：
            for(int i = right ; i >= left ; i--){
                mat[buttom][i] = num++ ;
            }
            buttom-- ;
            // 从左到右：
            for(int i = buttom ; i >= top ; i--){
                mat[i][left] = num++ ;
            }
            left++ ;
        }
        return mat ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}