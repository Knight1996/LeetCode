package leetcode.editor.cn;

//编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。 
//
// 
//
// 示例 1： 
//
// 输入：
//[
//  [1,1,1],
//  [1,0,1],
//  [1,1,1]
//]
//输出：
//[
//  [1,0,1],
//  [0,0,0],
//  [1,0,1]
//]
// 
//
// 示例 2： 
//
// 输入：
//[
//  [0,1,2,0],
//  [3,4,5,2],
//  [1,3,1,5]
//]
//输出：
//[
//  [0,0,0,0],
//  [0,4,5,0],
//  [0,3,1,0]
//]
// 
// Related Topics 数组 
// 👍 25 👎 0

public class ZeroMatrixLcci{
    public static void main(String[] args) {
        Solution solution = new ZeroMatrixLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void setZeroes(int[][] matrix) {
//      -----------------------------模拟（两次遍历）---------------------------------
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return ;
        }
        int row = matrix.length ;
        int col = matrix[0].length ;
        int[] rows = new int[row] ;
        int[] cols = new int[col] ;

        // 记录元素为零的 横坐标 与 纵坐标：
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1 ;
                    cols[j] = 1 ;
                }
            }
        }

        // 遍历更换：
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(rows[i] == 1 || cols[j] == 1){
                    matrix[i][j] = 0 ;
                }
            }
        }
//      ------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}