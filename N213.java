import java.util.Arrays;

/**
 * @author:Aurevoir
 * @date: 2019/12/11  10:53
 * 第一个房屋和最后一个房屋是紧挨着的
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，
 * 计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 输入: [2,3,2]
 * 输出: 3
 * 解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 * 示例 2:
 *[2,3,4,34,2]
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 *      偷窃到的最高金额 = 1 + 3 = 4
 */
class Solution2{
    public static int rob(int []nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int len = nums.length;
        int num1 ,num2;
        num1 = Rob(Arrays.copyOfRange(nums,0,len-1));
        num2 = Rob(Arrays.copyOfRange(nums,1,len));
        return Math.max(num1,num2);
    }
//[1,3,1,3,100]
    private static int Rob(int[] copyOfRange) {
        if (copyOfRange == null || copyOfRange.length == 0){
            return 0;
        }
        int len = copyOfRange.length;
        int dp[] = new int[len+1];

        dp[1]=copyOfRange[0];
        for(int i = 2;i < len+1;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+copyOfRange[i-1]);
        }
        return dp[len];
    }
}

public class N213 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,1,3,100};
        int res = Solution2.rob(nums);
        System.out.println(res);
    }
}
