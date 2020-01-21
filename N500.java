import java.util.*;

/**
 * @author:Aurevoir
 * @date: 2019/12/28  21:24
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *  
 *
 * 注意：
 *
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 */
public class N500 {
    public static void main(String[] args) {
        String[] strings = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(strings)));
    }

    private static String[] findWords(String[] words) {
        if(words == null){
            return null;
        }
        List<String> stringList = new ArrayList<>();
        String[] result = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        for(String string : words){
            if(panduan(string.toLowerCase(),result)){
                stringList.add(string);
            }
        }
        return stringList.toArray(new String[stringList.size()]);
    }

    private static boolean panduan(String string, String[] result) {
        String ans = null;
        for(String s1 : result){
            if(s1.indexOf(string.charAt(0)) > -1){
                ans = s1;
                break;
            }
        }
        if(ans == null){
            return false;
        }
        for(int i=1;i<string.length();i++){
            if(ans.indexOf(string.charAt(i))<0){
                return false;
            }
        }
        return true;
    }
}
