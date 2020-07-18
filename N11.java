/**
 * 给你 n 个非负整数 a1，a2，...，an，
 * 每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 
 * (i, ai) 和 (i, 0)。找出其中的两条线，
 * 使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */

public class N11 {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int res = 0;
        int start = 0,end = height.length-1;
        while(start < end){
            int area = Math.min(height[start],height[end]) * (end - start);
            res = Math.max(area,res);
            if(height[start] <= height[end]){
                ++start;
            }else{
                --end;
            }
        }
        return res;
    }
}
