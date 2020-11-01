package leetcode.editor.cn;

//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
//判断数组中是否含有该整数。 
//
// 
//
// 示例: 
//
// 现有矩阵 matrix 如下： 
//
// [
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
// 
//
// 给定 target = 5，返回 true。 
//
// 给定 target = 20，返回 false。 
//
// 
//
// 限制： 
//
// 0 <= n <= 1000 
//
// 0 <= m <= 1000 
//
// 
//
// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/ 
// Related Topics 数组 双指针 
// 👍 141 👎 0

public class ErWeiShuZuZhongDeChaZhaoLcof{
    public static void main(String[] args) {
        Solution solution = new ErWeiShuZuZhongDeChaZhaoLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//     -----------------------------暴力--------------------------------------
        /*if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false ;
        }

        int rows = matrix.length , col = matrix[0].length ;

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == target){
                    return true ;
                }
            }
        }
        return false ;*/
//      -------------------------------------------------------------------

//     -------------------------------线性查找--------------------------------
        //从数组的右上角开始查找：每次分析右上角元素
        //若  此元素 大于 目标元素 ，则列下标减一  （此列的右边（包括此列）都不会满足）
        //若  此元素 小于 目标元素 ，则行下标加一  （此行的上边（包括此行）都不会满足）
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false ;
        }

        int rows = matrix.length , cols = matrix[0].length ;
        int x = 0 , y = cols - 1 ;
        while(x < rows && y >= 0){
            int num = matrix[x][y] ;
            if(num == target){
                return true ;
            }
            else if(num < target){
                x++ ;
            }
            else{
                y-- ;
            }
        }

        return false ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}