import java.util.Scanner;

public class N9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        System.out.println(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        //负数肯定不是回文数,末位为0，若为回文数只能是0
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        //将后半部分反转进行对比
        int back=0;
        while(x>back){
            back=back*10+x%10;
            x/=10;
        }
        return x==back||x==back/10;
    }
}