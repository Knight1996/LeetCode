package leetcode.editor.cn;

//请你编写一个程序来计算两个日期之间隔了多少天。 
//
// 日期以字符串形式给出，格式为 YYYY-MM-DD，如示例所示。 
//
// 
//
// 示例 1： 
//
// 输入：date1 = "2019-06-29", date2 = "2019-06-30"
//输出：1
// 
//
// 示例 2： 
//
// 输入：date1 = "2020-01-15", date2 = "2019-12-31"
//输出：15
// 
//
// 
//
// 提示： 
//
// 
// 给定的日期是 1971 年到 2100 年之间的有效日期。 
// 
// 👍 26 👎 0

public class NumberOfDaysBetweenTwoDates{
    public static void main(String[] args) {
        Solution solution = new NumberOfDaysBetweenTwoDates().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int daysBetweenDates(String date1, String date2) {
//      ---------------------------Kim Larsen 公式----------------------------------
        return Math.abs(kimLarsen(date1) - kimLarsen(date2));

    }

    //利用Kim Larsen 公式  计算当前日期到0年0月0日的天数差
    public int kimLarsen(String date){
        String[] dateArr = date.split("-");
        int year = Integer.valueOf(dateArr[0]);
        int month = Integer.valueOf(dateArr[1]);
        int day = Integer.valueOf(dateArr[2]);

        if(month == 1 || month == 2){
            month += 12;
            year--;
        }

        return 365 * year + year / 4 - year / 100 + year / 400 + month * 28 + 2 * month + 3 * (month + 1) / 5 + day ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}