public class Q9IntegerPalindrome {
    public boolean isPalindrome(int x) {

        if ( x < 0) {
            return false;
        }

        int originalNumber = x ;
        int reversedNumber = 0;
        while(originalNumber != 0) {

            reversedNumber = reversedNumber*10 + originalNumber%10;
            originalNumber = originalNumber/10;
        }

        return reversedNumber == x;
    }
}
