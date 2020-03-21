import java.util.*;

public class N49 {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> res = new HashMap<
                >();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!res.containsKey(key)){
                res.put(key,new ArrayList<String>());
            }else{
                res.get(key).add(str);
            }
        }
        return new ArrayList<>(res.values());
    }
}
