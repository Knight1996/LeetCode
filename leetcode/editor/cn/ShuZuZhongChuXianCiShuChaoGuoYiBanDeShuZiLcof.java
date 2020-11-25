package leetcode.editor.cn;

//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 
//
// 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1: 
//
// 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
//输出: 2 
//
// 
//
// 限制： 
//
// 1 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/ 
//
// 
// Related Topics 位运算 分治算法 
// 👍 64 👎 0

import java.util.Arrays;
import java.util.HashMap;

public class ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
//      ------------------------利用内置排序函数----------------------
        /*Arrays.sort(nums);
        return nums[nums.length / 2];*/
//      -------------------------------------------------------------

//      -------------------------HashMap-----------------------------
        /*HashMap<Integer , Integer> map = new HashMap<>() ;
        int target = nums.length / 2 ;
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1) ;
            if(map.get(num) > target){
                return num ;
            }
        }
        return 0 ;*/
//      -------------------------------------------------------------

//      -------------------------摩尔投票法---------------------------
        //最后计数为正的数一定是众数 ；
        int votes = 0 ;              //投票计数
        int candidate = 0 ;          //候选者
        for(int num : nums){
            if(votes == 0){
                candidate = num ;
            }

            if(num == candidate){
                votes++ ;
            }
            else{
                votes-- ;
            }
        }
        return candidate ;
//      -------------------------------------------------------------

//      ---------------------------快速排序---------------------------
//        return quickSort(nums , 0 , nums.length - 1 , nums.length / 2) ;
//      --------------------------------------------------------------
    }

//    public int quickSort(int[] arr , int start , int end , int k){
//        int index = partition( arr , start , end) ;
//        if(index == k){
//            return arr[k] ;
//        }
//        else if(index < k){
//            return quickSort(arr , index + 1 , end , k) ;
//        }
//        else{
//            return quickSort(arr , start , index - 1 , k) ;
//        }
//    }
//
//    public int partition(int[] arr , int start , int end){
//        int flag = arr[start] ;
//        while(start < end){
//            while(start < end && flag <= arr[end]){
//                end-- ;
//            }
//            swap(arr , start , end);
//            while(start < end && flag >= arr[start]){
//                start++ ;
//            }
//            swap(arr , start , end);
//        }
//        return start ;
//    }
//
//    public void swap(int[] arr , int i , int j){
//        int tem = arr[i] ;
//        arr[i] = arr[j] ;
//        arr[j] = tem ;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}