/*
268
给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
示例 1:
        输入: [3,0,1]
        输出: 2
示例 2:
        输入: [9,6,4,2,3,5,7,0,1]
        输出: 8
*/

import java.util.Arrays;

public class N268 {
    public static void main(String[] args) {
        int res = 0;
        int array[] = new int[]{0};
        res = missingNumber(array);
        System.out.println(res);
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
//        首位不是0 则返回0
        if(nums[0] != 0){
            return 0;
        }
//        末位不是最大的 返回末位
        if(nums[nums.length - 1] != nums.length){
            return nums.length;
        }

        for(int i = 0; i < nums.length ;i ++ ) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return -1;
    }
}