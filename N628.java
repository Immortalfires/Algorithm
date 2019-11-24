import java.util.ArrayList;
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
