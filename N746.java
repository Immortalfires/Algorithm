public class N746 {
    public static void main(String[] args) {
        int[] cost = new int[]{10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {
        int x = 0 , y = 0;
        for(int i : cost){
            int res = i + Math.min(x,y);
            y = x;
            x = res;
        }
        return Math.min(x,y);
    }
}
