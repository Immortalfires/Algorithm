import java.util.Scanner;

/**
 * @author:Au revior
 * @date: 2019/11/7  20:01
 *
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 *
 * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 */
public class N8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String str) {
        //判断字符串是否为空
        if (str.isEmpty()){
            return 0;
        }

        int i = 0;
        //使i指向第一个不为空格的字符，并判断字符串是否仅包含空白字符
        while(str.charAt(i) == ' '){
            i++;
            if(i == str.length()){
                return 0;
            }
        }

        //判断正负号
        int flag = 1;
        if(str.charAt(i) == '+'){
            i++;
        }else if (str.charAt(i) == '-'){
            flag = -1;
            i++;
        }

        int res = 0;
        while(i < str.length()){
            int num = str.charAt(i) - '0';
            if(num < 0 | num > 9){
                break;
            }

            //2 的 31 次方 - 1 = 2147483648 - 1 = 2147483647
            if((res > Integer.MAX_VALUE / 10 ) || (res == Integer.MAX_VALUE / 10 && num > 7)){
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + num;
            i++;
        }
        return flag * res;
    }
}
