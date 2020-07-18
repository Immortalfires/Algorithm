import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，
 * 判断 nums 中是否存在三个元素 a，b，c
 * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */

public class N15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(nums);
        Iterator<List<Integer>> it1 = res.iterator();
        while(it1.hasNext()){
            List<Integer> list = it1.next();
            Iterator<Integer> it2 = list.iterator();
            while(it2.hasNext()){
                System.out.println(it2.next());
            }
        }
    }

    private static List<List<Integer>> threeSum(int[] nums){
        if(nums.length < 3 || nums == null){
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        return null;

    }
}
