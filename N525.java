import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:Aurevoir
 * @date: 2020/2/12  19:09
 * 给定一个二进制数组
 * 找到含有相同数量的 0 和 1 的最长连续子数组（的长度）
 */
public class N525 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0};
        System.out.println(findMaxLength(nums));
    }

    private static int findMaxLength(int[] nums) {
        /*
        int count = 0 ,maxlen = 0;
        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr,-2);
        arr[nums.length] = -1;
        for(int i = 0;i < nums.length;i++){
            count = count + (nums[i] == 0 ? -1 : 1);
            if(arr[count+ nums.length] >= -1){
                maxlen = Math.max(maxlen,i-arr[count + nums.length]);
            }else{
                arr[count+nums.length] = i;
            }
        }
        return maxlen;
         */

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlen = 0,count = 0;
        for(int i = 0;i < nums.length;i++){
            count = count + (nums[i] == 0 ? -1 : 1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen,i-map.get(count));
            }else {
                map.put(count,i);
            }
        }
        return maxlen;
    }
}
