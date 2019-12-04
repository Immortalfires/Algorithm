/*
编写一个算法来判断一个数是不是“快乐数”。

一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
然后重复这个过程直到这个数变为 1，
也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 */
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
