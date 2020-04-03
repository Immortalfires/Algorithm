public class N12 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(intToRoman(num));
    }

    private static String intToRoman(int num) {
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<romans.length;i++){
            while(num >= nums[i]){
                builder.append(romans[i]);
                num -= nums[i];
            }
        }
        return builder.toString();
    }
}
