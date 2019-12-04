/*
给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 */
import java.util.Arrays;

public class N628 {
    public static void main(String[] args) {
        int nums[] = new int[]{-1,-2,-3};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length-1] * nums[nums.length-2] * nums[nums.length - 3]);
    }
}
