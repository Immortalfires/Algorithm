/**
 * @author:Aurevoir
 * @date: 2019/12/4  20:41
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值
 * 并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 暴力出奇迹
 */
public class N35 {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,5,6};
        int num = 7;
        System.out.println(searchInsert(a,num));
    }

    private static int searchInsert(int[] nums, int target) {
        int res = 0 ;
        boolean flag = false;

        if(target > nums[nums.length - 1]){
            res = nums.length ;
        }else{
            for(int i = 0;i < nums.length;i++){
                if(nums[i] == target){
                    res = i;
                    flag = true;
                }
            }
            if(!flag){
                for(int i = 0;i < nums.length - 1;i++ ){
                    if(nums[i] < target && nums[i+1] > target){
                        res = i+1;
                        flag = true;
                    }
                }
            }
        }
        return res;
    }
}
