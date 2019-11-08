import java.util.*;

class Solution{
    public boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while(true){
            while(n > 0){
                sum += Math.pow(n % 10, 2);;
                n /= 10;
            }
            if(sum == 1){
                return true;
            }
            if(!set.contains(sum)){
                set.add(sum);
                n = sum;
                sum = 0;
            }else{
                return false;
            }
        }

    }
}

public class N202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.isHappy(num));
    }
}
