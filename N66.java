import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/11/21  19:57
 */
public class N66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digits[] = new int[]{9};
        int res[] = plusOne(digits);
        for(int n:res){
            System.out.print(n);
        }
    }

    private static int[] plusOne(int[] digits) {
        int i = 0;
        int len = digits.length;
        for(i = len-1;i >= 0;i--){
            digits[i]++;
            digits[i] %= 10;
            if(digits[i] != 0){
                return digits;
            }
        }
        int[] digits1 = new int[len + 1];
        digits1[0] = 1;
        return digits1;
    }
}
