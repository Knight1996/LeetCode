package leetcode.editor.cn;

//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。 
//
// 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。 
//
// 注意: 
//不能使用代码库中的排序函数来解决这道题。 
//
// 示例: 
//
// 输入: [2,0,2,1,1,0]
//输出: [0,0,1,1,2,2] 
//
// 进阶： 
//
// 
// 一个直观的解决方案是使用计数排序的两趟扫描算法。 
// 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。 
// 你能想出一个仅使用常数空间的一趟扫描算法吗？ 
// 
// Related Topics 排序 数组 双指针 
// 👍 689 👎 0

public class SortColors{
    public static void main(String[] args) {
        Solution solution = new SortColors().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {
//     --------------------------------单指针-----------------------------------------
        /*int len = nums.length;
        int flag = 0 ;
        for(int i = 0 ; i < len ; i++){
            if(nums[i] == 0){
                int tem = nums[i];
                nums[i] = nums[flag];
                nums[flag] = tem;
                flag++;
            }
        }

        for(int i = flag ; i < len ; i++){
            if(nums[i] == 1){
                int tem = nums[i];
                nums[i] = nums[flag];
                nums[flag] = tem;
                flag++;
            }
        }*/

//     ------------------------------双指针--------------------------------------
        int len = nums.length ;
        int flag0 = 0 , flag2 = len - 1 ;
        for(int i = 0 ; i < len ; i++){
            while(i <= flag2 && nums[i] == 2){
                int tem = nums[i];
                nums[i] = nums[flag2];
                nums[flag2] = tem;
                flag2--;
            }
            if(nums[i] == 0){
                int tem = nums[i];
                nums[i] = nums[flag0];
                nums[flag0] = tem;
                flag0++;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}