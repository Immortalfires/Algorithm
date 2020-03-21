import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length ;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i < nums.length;i++){
            int x = target - nums[i];
            if(map.containsKey(x) && map.get(x)!=i){
                return new int[]{i,map.get(x)};
            }
        }
        throw new IllegalArgumentException("No");
    }
}
