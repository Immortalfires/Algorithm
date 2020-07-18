public class N7 {
    public static void main(String[] args) {
        int x=-2933243;
        System.out.println(reverse(x));
    }


    public static int reverse(int x) {
        int res=0;
        while(x!=0){
            int y=x%10;
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && y>7)){
                return 0;
            }
            if(res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10 && y<-8)){
                return 0;
            }
            res = res*10+y;
            x /= 10;
        }
        return res;
    }
}
