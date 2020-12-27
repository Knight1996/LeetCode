package leetcode.editor.cn;

//有 n 位用户参加活动，他们的 ID 从 0 到 n - 1，每位用户都 恰好 属于某一用户组。给你一个长度为 n 的数组 groupSizes，其中包含每
//位用户所处的用户组的大小，请你返回用户分组情况（存在的用户组以及每个组中用户的 ID）。 
//
// 你可以任何顺序返回解决方案，ID 的顺序也不受限制。此外，题目给出的数据保证至少存在一种解决方案。 
//
// 
//
// 示例 1： 
//
// 输入：groupSizes = [3,3,3,3,3,1,3]
//输出：[[5],[0,1,2],[3,4,6]]
//解释： 
//其他可能的解决方案有 [[2,1,6],[5],[0,4,3]] 和 [[5],[0,6,2],[4,3,1]]。
// 
//
// 示例 2： 
//
// 输入：groupSizes = [2,1,3,3,3,2]
//输出：[[1],[0,5],[2,3,4]]
// 
//
// 
//
// 提示： 
//
// 
// groupSizes.length == n 
// 1 <= n <= 500 
// 1 <= groupSizes[i] <= n 
// 
// Related Topics 贪心算法 
// 👍 43 👎 0

import java.util.*;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo{
    public static void main(String[] args) {
        Solution solution = new GroupThePeopleGivenTheGroupSizeTheyBelongTo().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
//      ------------------------------------------哈希表-----------------------------------------------
//        List<List<Integer>> ans = new ArrayList<>() ;
//        Map<Integer , List<Integer>> hashMap = new HashMap<>();
//        int len = groupSizes.length;
//
//        for(int i = 0 ; i < len ; i++){
//            if(!hashMap.containsKey(groupSizes[i])){
//                List<Integer> list = new ArrayList<>() ;
//                hashMap.put(groupSizes[i] , list) ;
//            }
//            hashMap.get(groupSizes[i]).add(i) ;
//            if(hashMap.get(groupSizes[i]).size() >= groupSizes[i]){
//                ans.add(new ArrayList<>(hashMap.get(groupSizes[i])));
//                hashMap.get(groupSizes[i]).clear();
//            }
//        }
//
//        return ans ;
//      -----------------------------------------------------------------------------------------------

//      ------------------------------------------ Map ------------------------------------------------
        //   将 分组大小 和 ID 两个信息绑定在一个数字上：
        //   1002:    分组大小（高位）：1   ID（低位）：2
        for(int i = 0 ; i < groupSizes.length ; i++){
            groupSizes[i] = groupSizes[i] * 1000 + i ;
        }

        List<List<Integer>> ans = new ArrayList<>() ;
        Arrays.sort(groupSizes);

        int index = 0 ;
        while(index < groupSizes.length){
            List<Integer> list = new ArrayList<>() ;
            for(int j = index ; j < index + groupSizes[index] / 1000 ; j++){
                list.add(groupSizes[j] % 1000);
            }
            ans.add(list);
            index = index + groupSizes[index] / 1000 ;
        }
        return ans ;
//      --------------------------------------------------------------------------------------------
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}