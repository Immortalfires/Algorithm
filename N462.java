import java.util.Arrays;

/**
 * @author:Aurevoir
 * @date: 2020/2/19  18:41
 * 给定一个非空整数数组，
 * 找到使所有数组元素相等所需的最小移动数，
 * 其中每次移动可将选定的一个元素加1或减1。
 * 您可以假设数组的长度最多为10000。
 *
 * 输入:[1,2,3]    输出:2
 * 说明：
 * 只有两个动作是必要的
 * （记得每一步仅可使其中一个元素加1或减1）：
 *
 * [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
 */
public class N462 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(minMoves(nums));
    }

    private static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int n:nums){
            sum += Math.abs(nums[nums.length / 2]-n);
        }
        return sum;
    }
}
