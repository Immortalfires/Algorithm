import java.util.ArrayList;
import java.util.List;

/**
 * @author:Aurevoir
 * @date: 2020/2/19  19:17
 *
 * 给定一个非负整数数组 A，返回一个数组，
 * 在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 */
public class N905 {
    public static void main(String[] args) {
        int[] A = new int[]{3,1,2,4};
        int[] res = sortArrayByParity(A);
        for(int i:res){
            System.out.println(i);
        }
    }

//    private static int[] sortArrayByParity(int[] A) {
//        List<Integer> even = new ArrayList<>();
//        List<Integer> odd = new ArrayList<>();
//        for(int i : A){
//            if(i % 2 == 0)
//                even.add(i);
//            else
//                odd.add(i);
//        }
//        even.addAll(odd);
//        int[] res = new int[even.size()];
//        for(int i=0;i<even.size();i++){
//            res[i] = even.get(i);
//        }
//        return res;
//    }

    private static int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int j = 0;
        for (int item : A) {
            if (item % 2 == 0) {
                res[j++] = item;
            }
        }
        for (int value : A) {
            if (value % 2 != 0) {
                res[j++] = value;
            }
        }
        return res;
    }
}
