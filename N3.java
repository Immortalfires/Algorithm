import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int res = 0, i = 0, j = 0;
        while(i < len && j < len){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                res = Math.max(j-i,res);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return res;
    }
}
