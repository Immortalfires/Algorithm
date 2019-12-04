import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/11/21  19:57
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头
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
