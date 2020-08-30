package leetcode.editor.cn;

//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4] 
//
// 
//
// 说明： 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 224 👎 0

public class IntersectionOfTwoArrays{
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>() ;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 ;
        int j = 0 ;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]) ;
                i++ ;
                j++ ;
            }
            else if(nums1[i] < nums2[j]){
                i++ ;
            }
            else{
                j++ ;
            }
        }

        int[] ans = new int[set.size()] ;
        int index = 0 ;
        for(int num : set){
            ans[index++] = num ;
        }
        return ans ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}