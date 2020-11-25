package leetcode.editor.cn;

//输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [3,2,1], k = 2
//输出：[1,2] 或者 [2,1]
// 
//
// 示例 2： 
//
// 输入：arr = [0,1,2,1], k = 1
//输出：[0] 
//
// 
//
// 限制： 
//
// 
// 0 <= k <= arr.length <= 10000 
// 0 <= arr[i] <= 10000 
// 
// Related Topics 堆 分治算法 
// 👍 129 👎 0

import java.util.Arrays;

public class ZuiXiaoDeKgeShuLcof{
    public static void main(String[] args) {
        Solution solution = new ZuiXiaoDeKgeShuLcof().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
//      ------------------------排序-----------------------------
        /*int[] ans = new int[k] ;
        Arrays.sort(arr) ;
        for(int i = 0 ; i < k ; i++){
            ans[i] = arr[i] ;
        }
        return ans ;*/
//      ---------------------------------------------------------

//      -------------------------快排-----------------------------
        if(k == 0 || arr.length == 0){
            return new int[0] ;
        }
        return quickSort(arr , 0 , arr.length - 1 , k - 1) ;
    }

    public int[] quickSort(int[] arr , int start , int end , int k){
        int index = partition(arr , start , end) ;
        if(index == k){
            return Arrays.copyOf(arr , index + 1) ;
        }
        return index > k ? quickSort(arr , start , index - 1 , k) : quickSort(arr , index + 1 , end , k) ;
    }

    private int partition(int[] arr , int start , int end){
        int flag = arr[start] ;
        while(start < end){
            while(start < end && arr[end] >= flag){
                end-- ;
            }
            swap(arr , start , end) ;
            while(start < end && arr[start] <= flag){
                start++ ;
            }
            swap(arr , start , end) ;
        }
        return start ;
    }

    public void swap(int[] arr , int i , int j){
        int tem = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = tem ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}