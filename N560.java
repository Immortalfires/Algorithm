import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个整数 k，
 * 你需要找到该数组中和为 k 的连续的子数组的个数。
 */
public class N560 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1};
        int k = 2;
        System.out.println("穷举法："+subarraySum1(nums,k));
        System.out.println("前缀和+哈希表优化："+subarraySum2(nums,k));
    }

    /**
     * 穷举法
     * @param nums  数组
     * @param k  k值
     * @return count
     */
    public static int subarraySum1(int[] nums, int k) {
        int count = 0;
        for(int start = 0;start < nums.length;start++){
            int sum = 0;
            for(int end = start;end >= 0;end--){
                sum += nums[end];
                if(sum == k){
                    count ++;
                }
            }
        }
        return count;
    }

    /**
     * 前缀和+哈希表优化
     * @param nums 数组
     * @param k 数值
     * @return count
     */
    public static int subarraySum2(int[] nums, int k){
        int count = 0,pre = 0;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre += nums[i];
            if(map.containsKey(pre-k)){
                count += map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0) + 1);
        }
        return count;
    }
}
