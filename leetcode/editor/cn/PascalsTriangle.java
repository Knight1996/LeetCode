package leetcode.editor.cn;

//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组 
// 👍 349 👎 0

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{
    public static void main(String[] args) {
        Solution solution = new PascalsTriangle().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>() ;

        if(numRows == 0){
            return ans ;
        }
        ans.add(new ArrayList<>()) ;
        ans.get(0).add(1) ;

        for(int rowNum = 1 ; rowNum < numRows ; rowNum++){
            List<Integer> row = new ArrayList<>() ;
            List<Integer> preRow = ans.get(rowNum - 1) ;
            row.add(1) ;//第一个元素为 1
            for(int j = 1 ; j < rowNum ; j++){
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            row.add(1) ;
            ans.add(row) ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}