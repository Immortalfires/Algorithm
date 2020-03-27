public class N914 {
    public static void main(String[] args) {
        int[] deck = new int[]{1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(deck));
    }

    private static boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for(int x:deck){
            count[x]++;
        }
        int flag=-1;
        for(int i=0;i<10000;++i){
            if(count[i]!=0){
                if(flag==-1){
                    flag = count[i];
                }else{
                    flag=panduan(flag,count[i]);
                }
            }
        }
        return flag >= 2;
    }

    private static int panduan(int flag, int i) {
        return flag == 0?i:panduan(i%flag,flag);
    }
}
