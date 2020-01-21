/**
 * @author:Aurevoir
 * @date: 2020/1/21  13:38
 *
 * 数组 A 是 [0, 1, ..., N - 1] 的一种排列，N 是数组 A 的长度。
 * 全局倒置指的是 i,j 满足 0 <= i < j < N 并且 A[i] > A[j]
 * 局部倒置指的是 i 满足 0 <= i < N 并且 A[i] > A[i+1] 。
 * 当数组 A 中全局倒置的数量等于局部倒置的数量时，返回 true 。
 * 示例 1:  输入: A = [1,0,2]        输出: true    解释: 有 1 个全局倒置，和 1 个局部倒置。
 * 示例 2: 输入: A = [1,2,0]   输出: false    解释: 有 2 个全局倒置，和 1 个局部倒置。
 */
public class N775 {
    public static void main(String[] args) {
        int[] A = new int[]{1,0,2};
        System.out.println(isIdealPermutation(A));
    }
    private static boolean isIdealPermutation(int[] A) {
        int n = A.length;
        int min = n;
        for(int i = n-1;i >= 2;i--){
            min = Math.min(min,A[i]);
            if(A[i-2] > min){
                return false;
            }
        }
        return true;
    }
}
