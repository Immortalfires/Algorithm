//暴力
public class N5 {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestPalindrome(str));
    }

    private static String longestPalindrome(String s) {
        String res = "";
        int max = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String tried = s.substring(i,j);
                if(isHui(tried) && tried.length() > max){
                    max = tried.length();
                    res = tried;
                }
            }
        }
        return res;
    }

    private static boolean isHui(String s) {
        int len = s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
