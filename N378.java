/**
 * @author:Aurevoir
 * @date: 2019/12/22  13:41
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。
 * 请注意，它是排序后的第k小元素，而不是第k个元素。
 *
 * 示例:
 *
 * matrix = [
 *    [ 1,  3,  4],
 *    [ 2,  7,  9],
 *    [ 5,  9, 15]
 * ],
 * k = 8,
 *
 * 返回 13。
 * 说明:
 * 你可以假设 k 的值永远是有效的, 1 ≤ k ≤ n2 。
 */
public class N378 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3},{1,2}};
        int k = 3;
        System.out.println(kthSmallest(matrix,k));
    }

    private static int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int min = matrix[0][0];
        int max = matrix[row-1][col-1];
        while(min < max){
            int mid = (max+min)/2;
            int count = numSmallerThanMid(matrix,mid,row,col);
            if(count < k){
                min = mid+1;
            }else {
                max = mid;
            }
        }
        return max;
    }

    private static int numSmallerThanMid(int[][] matrix, int mid, int row, int col) {
        int i = row-1;
        int j = 0;
        int res = 0;
        while(i > 0 && j < col){
            if(matrix[i][j] <= mid){
                res += i+1;
                j++;
            }else{
                i--;
            }
        }
        return res;
    }
}
