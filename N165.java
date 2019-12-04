import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/12/4  21:14
 * 如果 version1 > version2 返回 1，如果 version1 < version2 返回 -1， 除此之外返回 0。
 * 你可以假设版本号的每一级的默认修订版号为 0。
 * 例如，版本号 3.4 的第一级（大版本）和第二级（小版本）修订号分别为 3 和 4。
 * 其第三级和第四级修订号均为 0。
 *
 * 输入: version1 = "0.1", version2 = "1.1"
 * 输出: -1
 *
 * 输入: version1 = "1.0.1", version2 = "1"
 * 输出: 1
 *
 * 输入: version1 = "7.5.2.4", version2 = "7.5.3"
 * 输出: -1
 *
 * 输入：version1 = "1.01", version2 = "1.001"
 * 输出：0
 * 解释：忽略前导零，“01” 和 “001” 表示相同的数字 “1”。
 *
 * 输入：version1 = "1.0", version2 = "1.0.0"
 * 输出：0
 * 解释：version1 没有第三级修订号，这意味着它的第三级修订号默认为 “0”。
 */
public class N165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(compareVersion(str1,str2));
    }

    private static int compareVersion(String string1, String string2) {
        String[] str1 = string1.split("\\.");
        String[] str2 = string2.split("\\.");
        int len = Math.max(str1.length,str2.length);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0;i <len;i++){
            if(i >= str1.length){
                list1.add(0);
            }else
                list1.add(Integer.parseInt(str1[i]));
        }

        for(int i = 0;i <len;i++){
            if(i >= str2.length){
                list2.add(0);
            }else
                list2.add(Integer.parseInt(str2[i]));
        }

        for(int i = 0;i < len;i++){
            int a = list1.get(i);
            int b = list2.get(i);
            if(a > b){
                return  1;
            }else if(a < b){
                return -1;
            }
        }
        return 0;
    }
}
