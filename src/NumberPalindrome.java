public class NumberPalindrome {
    public static void main(String args[]) {
       boolean ischeck =  isPalindrome(57);
        System.out.println(ischeck);
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int number1 = Math.abs(number);
        while (number1 > 0){
            int lastDigit = number1%10;
            reverse = reverse * 10 + lastDigit;
            number1 /=10;
        }
        if(number == reverse)
            return true;
        else
            return false;
            //System.out.println(reverse);
            //return reverse == Math.abs(number);
    }
}
