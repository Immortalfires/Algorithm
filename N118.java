import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author:Aurevoir
 * @date: 2019/11/11  20:09
 */

public class N118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
//        输出的杨辉三角
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

//        返回特殊值
        if(numRows == 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int i = 1;i < numRows;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> lastRow = triangle.get(i-1);

            row.add(1);
            for(int j = 1 ;j < i;j++){
                row.add(lastRow.get(j-1) + lastRow.get(j));
            }

            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }
}