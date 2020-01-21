import java.util.HashMap;
/**
 * @author:Aurevoir
 * @date: 2020/1/21  14:18
 *
 * 给你一个由一些多米诺骨牌组成的列表 dominoes。
 * 如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
 *
 * 形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。
 *
 * 在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。
 * dominoes = [[1,2],[2,1],[3,4],[5,6]]
 * 输出：1
 */
public class N1128 {
    public static void main(String[] args) {
        int[][] dominoes = new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        System.out.println(numEquivDominoPairs(dominoes));
    }
    private static int numEquivDominoPairs(int[][] dominoes) {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<dominoes.length;i++){
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            int key = Math.min(a,b)*10+Math.max(a,b);
            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                int val = map.get(key);
                map.put(key,val+1);
            }
        }
        for(int k :map.values()){
            ans += k*(k-1)/2;
        }
        return ans;
    }
}
