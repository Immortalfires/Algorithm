/*125
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
说明：本题中，我们将空字符串定义为有效的回文串。
示例 1:
        输入: "A man, a plan, a canal: Panama"
        输出: true
示例 2:
        输入: "race a car"
        输出: false
 */

import java.util.Scanner;
public class N125 {
    public static void main(String[] args) {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        System.out.println(judge(str));
    }

    public static boolean judge(String str) {
        if (str.equals("")) {
            return true;
        }
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            while(!isAlphaNumber(str.charAt(i))){
                i++;
                if (i == str.length()) {
                    return true;
                }
            }
            while (!isAlphaNumber(str.charAt(j))) {
                j--;
            }
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isAlphaNumber(char c) {
        if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z' || '0' <= c && c <= '9') {
            return true;
        }
        return false;
    }
}
