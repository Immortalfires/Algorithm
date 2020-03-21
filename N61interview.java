import java.util.Arrays;

public class N61interview {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(isStraight(nums));
    }

    private static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0 ,j = 1;j<5;i++,j++){
            if(nums[i] == 0){
                count++;
            }
            if(nums[i] == nums[j] && nums[j] != 0) {
                return false;
            }
        }
        if(nums[4] - nums[count] <= 4){
            return true;
        }
        return false;
    }
}
