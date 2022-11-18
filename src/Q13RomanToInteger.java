import java.util.HashMap;

public class Q13RomanToInteger {
    public int romanToInt(String s) {
        int number = 0;

//        for (int i = 0; i < s.length(); i++) {
//            switch (s.charAt(i)) {
//                case 'M':
//                    number = number + 1000;
//                    break;
//                case 'D':
//                    number = number + 500;
//                    break;
//                case 'C':
//                    if (s.charAt(i + 1) == 'D') {
//                        number = number + 400;
//                        i++;
//                    } else if (s.charAt(i + 1) == 'M') {
//                        number = number + 900;
//                        i++;
//                    } else {
//                        number = number + 100;
//                    }
//                case 'L':
//                    number = number + 50;
//                    break;
//                case 'X':
//                    if ( i + 1 < s.length() && s.charAt(i + 1) == 'L') {
//                        number = number + 40;
//                        i++;
//                    } else if ( i + 1 < s.length() && s.charAt(i + 1) == 'C') {
//                        number = number + 90;
//                        i++;
//                    } else {
//                        number = number + 10;
//                    }
//                    break;
//                case 'V':
//                    number = number + 5;
//                    break;
//                case 'I':
//                    if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
//                        number = number + 4;
//                        i++;
//                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
//                        number = number + 9;
//                        i++;
//                    } else {
//                        System.out.println("pinrt");
//                        number = number + 1;
//                    }
//                    break;
//            }
//        }
//        return number;

        HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        for(int i = 0; i < s.length(); i++) {
            if(i > 0 && romanValues.get(s.charAt(i)) > romanValues.get(s.charAt(i-1))) {
                number = number + romanValues.get(s.charAt(i)) -  2 * romanValues.get(s.charAt(i-1));
            } else {
                number = number + romanValues.get(s.charAt(i));
            }
        }
        return number;
    }
}
