import java.util.HashMap;
import java.util.Map;

public class N13 {
    public static void main(String[] args) {
        String str = "IX";
        System.out.println(romanToInt(str));
    }

    private static int romanToInt(String s) {
        int res = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len = s.length();
        for(int i=0;i<len-1;i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res -= map.get(s.charAt(i));
            }else{
                res += map.get(s.charAt(i));
            }
        }
        return res += map.get(s.charAt(len-1));
    }
}
