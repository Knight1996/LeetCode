package leetcode.editor.cn;

//有一个二维矩阵 grid ，每个位置要么是陆地（记号为 0 ）要么是水域（记号为 1 ）。 
//
// 我们从一块陆地出发，每次可以往上下左右 4 个方向相邻区域走，能走到的所有陆地区域，我们将其称为一座「岛屿」。 
//
// 如果一座岛屿 完全 由水域包围，即陆地边缘上下左右所有相邻区域都是水域，那么我们将其称为 「封闭岛屿」。 
//
// 请返回封闭岛屿的数目。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1
//,0,1],[1,1,1,1,1,1,1,0]]
//输出：2
//解释：
//灰色区域的岛屿是封闭岛屿，因为这座岛屿完全被水域包围（即被 1 区域包围）。 
//
// 示例 2： 
//
// 
//
// 输入：grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
//输出：1
// 
//
// 示例 3： 
//
// 输入：grid = [[1,1,1,1,1,1,1],
//             [1,0,0,0,0,0,1],
//             [1,0,1,1,1,0,1],
//             [1,0,1,0,1,0,1],
//             [1,0,1,1,1,0,1],
//             [1,0,0,0,0,0,1],
//             [1,1,1,1,1,1,1]]
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= grid.length, grid[0].length <= 100 
// 0 <= grid[i][j] <=1 
// 
// Related Topics 深度优先搜索 
// 👍 62 👎 0

public class NumberOfClosedIslands{
    public static void main(String[] args) {
        Solution solution = new NumberOfClosedIslands().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int closedIsland(int[][] grid) {
//      ----------------------------------------DFS------------------------------------------------
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0 ;
        for(int i = 1 ; i < row ; i++){
            for(int j = 1; j < col ; j++){
                if(grid[i][j] == 0 && dfs(grid , i , j)){
                    ans++ ;
                }
            }
        }
        return ans ;
    }

    public boolean dfs(int[][] grid , int i , int j){
        int row = grid.length;
        int col = grid[0].length;
        if(i < 0 || j < 0 || i >= row || j >= col){
            return false ;
        }
        if(grid[i][j] != 0){
            return true ;
        }
        grid[i][j] = 1 ; // 访问过的标记：
        boolean up = dfs(grid , i - 1 , j) ;
        boolean down = dfs(grid , i + 1 , j) ;
        boolean left = dfs(grid , i , j -1) ;
        boolean right = dfs(grid , i , j+ 1) ;
        return left && right && up && down ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}