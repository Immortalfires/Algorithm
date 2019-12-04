import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/12/4  21:05
 *
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 */
public class N171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(titleToNumber(str));
    }

    private static int titleToNumber(String s) {
        int len,sum = 0;
        len = s.length();
        for(int i = 0;i < len;i++) {
            sum = sum * 26 + s.charAt(i) - 'A' + 1;
        }
        return sum;
    }
}
