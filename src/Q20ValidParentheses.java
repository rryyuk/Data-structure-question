import java.util.Stack;

public class Q20ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> parentheses = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                parentheses.push(s.charAt(i));
            } else {
                if (parentheses.isEmpty()) {
                    return false;
                } else if (s.charAt(i) == ')' && parentheses.peek() != '(' ) {
                    return false;
                } else if (s.charAt(i) == ']' && parentheses.peek() != '['  ) {
                    return false;
                } else if (s.charAt(i) == '}' && parentheses.peek() != '{' ) {
                    return false;
                }
                parentheses.pop();
            }

        }

        if (parentheses.isEmpty()){
            return true;
        }   else {
            return false;
        }
    }
}
