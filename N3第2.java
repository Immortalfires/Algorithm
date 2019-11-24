import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N3第2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int res = 0 ,i = 0 ,j = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(;j < len;j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            res = Math.max(res,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return res;
    }
}
