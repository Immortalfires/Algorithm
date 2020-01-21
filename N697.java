import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:Aurevoir
 * @date: 2019/12/22  13:27
 * 给定一个非空且只包含非负数的整数数组 nums,
 * 数组的度的定义是指数组里任一元素出现频数的最大值。
 *
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 *
 * 示例 1: 输入: [1, 2, 2, 3, 1]  输出: 2
            解释: 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
 * 连续子数组里面拥有相同度的有如下所示:
 * [1, 2, 2, 3, 1] , [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * 最短连续子数组[2, 2]的长度为2，所以返回2.
 * 示例 2:  输入: [1,2,2,3,1,4,2]   输出: 6
 */
public class N697 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,1};
        System.out.println(findShortestSubArray(nums));
    }

    private static int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> left = new HashMap<>(),
        right = new HashMap<>() ,count = new HashMap<>();

        for(int i=0;i < nums.length;i++){
            if(left.get(nums[i]) == null)
                left.put(nums[i],i);
            right.put(nums[i],i);
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());
        for(int x:count.keySet()){
            if(count.get(x) == degree){
                ans = Math.min(ans,right.get(x)-left.get(x)+1);
            }
        }
        return ans;
    }
}
