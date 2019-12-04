import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/12/4  20:10
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 1
 * 11
 * 21
 * 1211
 * 111221
 */
public class N38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countAndSay(n));
    }

    private static String countAndSay(int n) {
        String s = "1";
        if (n == 1) {
            return s;
        }
        for(int j = 2;j <= n;j++){
            StringBuffer stringBuffer = new StringBuffer();
            char c = s.charAt(0);
            int count = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                } else {
                    stringBuffer.append(count).append(c);
                    count = 1;
                    c = s.charAt(i);
                }
            }
            stringBuffer.append(count).append(c);
            s = stringBuffer.toString();
        }
        return s;
    }
}
