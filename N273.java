/**
 * @author:Aurevoir
 * @date: 2020/2/12  19:28
 * 将非负整数转换为其对应的英文表示
 */
public class N273 {
    public static void main(String[] args) {
        int num = 1234567891;
        System.out.println(numberToWords(num));
    }

    private static String one(int num) {
        String[] nums = new String[]{"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return nums[num-1];
    }

    private static String lessThan20(int num) {
        String[] nums = new String[]{"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        return nums[num%10];
    }

    private static String ten(int num){
        String[] nums = new String[]{"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        return nums[num - 2];
    }

    private static String two(int num) {
        if(num == 0)
            return "";
        else if(num < 10)
            return one(num);
        else if(num < 20)
            return lessThan20(num);
        else{
            int tenner = num / 10;
            int rest = num % 10;
            if(rest != 0)
                return ten(tenner) + " "+ one(rest);
            else
                return ten(tenner);
        }
    }

    private static String three(int num) {
        int hundred = num / 100;
        int rest = num - hundred * 100;
        String res = "";
        if((hundred != 0 ) && (rest != 0)){
            res = one(hundred) + " Hundred " + two(rest);
        }else if((hundred == 0) && (rest != 0)){
            res = two(rest);
        }else if((hundred!=0) && (rest == 0)){
            res = one(hundred) + " Hundred";
        }
        return res;
    }

    private static String numberToWords(int num) {
        if(num == 0)
            return "Zero";
        int billion = num / 1000000000;
        int million = (num - billion * 1000000000) / 1000000;
        int thousand = (num - billion * 1000000000 - million * 1000000) / 1000;
        int rest = num - billion * 1000000000 - million * 1000000 - thousand * 1000;

        String result = "";
        if(billion !=0) {
            result = three(billion) + " Billion";
        }
        if(million != 0){
            if(!result.isEmpty())
                result += " ";
            result += three(million) + " Million";
        }
        if(thousand != 0){
            if(!result.isEmpty())
                result += " ";
            result += three(thousand) + " Thousand";
        }
        if(rest != 0){
            if(!result.isEmpty())
                result += " ";
            result += three(rest);
        }
        return result;
    }
}
