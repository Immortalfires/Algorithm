import java.util.HashMap;
import java.util.Map;

public class N169 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElementByVotes(nums));
    }

    private static int majorityElementByVotes(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for(int n:nums){
            if(count == 0){
                candidate = n;
            }
            count+=(n==candidate)?1:-1;
        }
        return candidate;
    }

    private static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                int i = map.get(num);
                map.put(num,i+1);
            }else{
                map.put(num,1);
            }
        }

        Map.Entry<Integer,Integer> entry = null;
        for(Map.Entry<Integer,Integer> entry1 : map.entrySet()){
            if(entry == null || entry1.getValue()>entry.getValue()){
                entry = entry1;
            }
        }
        return entry.getKey();
    }
}
