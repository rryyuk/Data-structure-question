public class Q796RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        if((s+s).contains(goal) == false ) {
            return false;
        }
        return true;
    }
}
