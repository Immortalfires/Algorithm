import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/11/14  11:20
 *
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class N119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowIndex = scanner.nextInt();

        System.out.println(getRow(rowIndex));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> last = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        for(int i=0;i<=rowIndex;i++){
            cur = new ArrayList<>();
            for(int j=0;j <= i;j++){
                if(j==0 || i==j){
                    cur.add(1);
                }else{
                    cur.add(last.get(j) + last.get(j-1));
                }
            }
            last = cur;
        }

        return cur;
    }
}
