/*673
给定一个未排序的整数数组，找到最长递增子序列的个数。
示例 1:
        输入: [1,3,5,4,7]
        输出: 2
        解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
示例 2:
        输入: [2,2,2,2,2]
        输出: 5
        解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
注意: 给定的数组长度不超过 2000 并且结果一定是32位有符号整数。
 */


import java.util.Arrays;

public class N673 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 4, 7};
        int a = findNumberOfLIS(nums);
        System.out.println(a);
    }

    public static int findNumberOfLIS(int[] nums) {
        int N = nums.length;
        if (N <= 1) return N;
        int[] lengths = new int[N];
        int[] counts = new int[N];
        Arrays.fill(counts, 1);

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < j; i++) if (nums[i] < nums[j]) {
                if (lengths[i] >= lengths[j]) {
                    lengths[j] = lengths[i] + 1;
                    counts[j] = counts[i];
                } else if (lengths[i] + 1 == lengths[j]) {
                    counts[j] += counts[i];
                }
            }
        }

        int longest = 0, ans = 0;
        for (int length: lengths) {
            longest = Math.max(longest, length);
        }
        for (int i = 0; i < N; ++i) {
            if (lengths[i] == longest) {
                ans += counts[i];
            }
        }
        return ans;
    }
}
