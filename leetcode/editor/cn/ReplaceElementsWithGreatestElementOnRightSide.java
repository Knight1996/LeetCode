package leetcode.editor.cn;

//给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。 
//
// 完成所有替换操作后，请你返回这个数组。 
//
// 
//
// 示例： 
//
// 
//输入：arr = [17,18,5,4,6,1]
//输出：[18,6,6,6,1,-1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^4 
// 1 <= arr[i] <= 10^5 
// 
// Related Topics 数组 
// 👍 43 👎 0

public class ReplaceElementsWithGreatestElementOnRightSide{
    public static void main(String[] args) {
        Solution solution = new ReplaceElementsWithGreatestElementOnRightSide().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int arrMax = arr[n - 1];
        arr[n-1] = -1;
        for(int i = n - 2 ; i >= 0 ; i--){
            int tem = arr[i];
            arr[i] = arrMax;
            if(tem > arrMax){
                 arrMax = tem;
            }
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}