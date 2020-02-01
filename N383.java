import java.util.HashSet;
import java.util.Set;;

/**
 * @author:Aurevoir
 * @date: 2020/1/30  12:27
 */
public class N383 {
    public static void main(String[] args) {
        String ransom = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransom,magazine));
    }

    private static boolean canConstruct(String ransom, String magazine) {
        if(magazine.length() < ransom.length()){
            return false;
        }
        int[] asc = new int[26];
        int i = 0;
        for(i=0;i<magazine.length();i++){
            asc[magazine.charAt(i)-'a'] ++;
        }
        for(i=0;i<ransom.length();i++){
            if(asc[ransom.charAt(i)-'a'] == 0){
                return false;
            }else{
                asc[ransom.charAt(i)-'a']--;
            }
        }
        return true;
    }
}
