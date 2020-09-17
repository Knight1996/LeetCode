package leetcode.editor.cn;

//给你两个数组，arr1 和 arr2， 
//
// 
// arr2 中的元素各不相同 
// arr2 中的每个元素都出现在 arr1 中 
// 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例： 
//
// 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 
//
// 提示： 
//
// 
// arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
// Related Topics 排序 数组 
// 👍 78 👎 0

public class RelativeSortArray{
    public static void main(String[] args) {
        Solution solution = new RelativeSortArray().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001] ;
        for(int i : arr1){
            cnt[i]++ ;
        }

        int index = 0 ;
        for(int num2 : arr2){
            while(cnt[num2] > 0){
                arr1[index++] = num2 ;
                cnt[num2] -- ;
            }
        }
        for(int num1 = 0 ; num1 < cnt.length ; num1++){
            while(cnt[num1] > 0){
                arr1[index++] = num1 ;
                cnt[num1]-- ;
            }
        }
        return arr1 ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}