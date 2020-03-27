//动态规划
public class N5第2 {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestPalindrome(str));
    }

    private static String longestPalindrome(String s) {
        int len = s.length();
        if(len<2){
            return s;
        }
        boolean[][] dp = new boolean[len][len];
        for(int i=0;i<len;i++){
            dp[i][i]=true;
        }
        int maxlen = 1;
        int start = 0;
        for(int i = 1;i < len;i++){
            for(int j = 0;j < i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(i - j < 3){
                        dp[j][i] = true;
                    }else{
                        dp[j][i] = dp[j+1][i-1];
                    }
                }else{
                    dp[j][i] = false;
                }
                if(dp[j][i]){
                    int curLen = i-j+1;
                    if(curLen > maxlen){
                        maxlen = curLen;
                        start = j;
                    }
                }
            }
        }
        return s.substring(start,start+maxlen);
    }
}
