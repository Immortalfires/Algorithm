/**
 * @author:Aurevoir
 * @date: 2019/12/12  20:48
 */
class Solution4 {
    private class Bucket {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
    }

    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        for(int i:nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
//        桶的个数
        int bucketSize = Math.max(1,(max-min)/(nums.length-1));
//        桶的间距
        Bucket[] buckets = new Bucket[(max-min)/bucketSize + 1];

        for(int num:nums){
            int loc=(num-min)/bucketSize;
            if(buckets[loc] == null){
                buckets[loc] = new Bucket();
            }
            buckets[loc].max=Math.max(buckets[loc].max,num);
            buckets[loc].min=Math.min(buckets[loc].min,num);
        }
        int previousMax=Integer.MIN_VALUE , maxGap = Integer.MIN_VALUE;
        for (Bucket bucket : buckets) {
            if (bucket != null && previousMax != Integer.MAX_VALUE) {
                maxGap = Math.max(maxGap, bucket.min - previousMax);
            }
            if (bucket != null) {
                previousMax = bucket.max;
                maxGap = Math.max(maxGap, bucket.max - bucket.min);
            }
        }
        return maxGap;
    }
}

public class N164第2 {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int[] nums = new int[]{1,1,1,1};
        System.out.print(solution.maximumGap(nums));
    }
}
