public class Q1903LargestOddNumberString {
    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i >= 0; i--) {
            char currentNumber = num.charAt(i);
            if(currentNumber%2 == 1) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
