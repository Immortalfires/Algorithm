/**
 * @author:Aurevoir
 * @date: 2020/1/30  12:54
 */
public class N485 {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int i = 0 ,count = 0 ,maxCount = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }else{
                maxCount = Math.max(count,maxCount);
                count = 0;
            }
        }
        return Math.max(count,maxCount);
    }
}
