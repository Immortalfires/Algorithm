import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/12/4  20:59
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值
 * 并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 二分查找
 */
public class N35第2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,5,6};
        int num = 7;
        System.out.println(searchInsert(a,num));
    }

    private static int searchInsert(int[] nums, int target) {
        int left = 0 ,right = nums.length ;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(target > nums[mid]){
                left = mid + 1;
            }else if(target < nums[mid]){
                right = mid;
            }else {
                return mid;
            }
        }
        return left;
    }
}

