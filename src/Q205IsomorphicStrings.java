import java.util.HashMap;

public class Q205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> characterHashMap = new HashMap<Character, Character>();
        HashMap<Character, Boolean> characterCheckHashmap = new HashMap<Character, Boolean>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            char charOfFirstString = s.charAt(i);
            char charOfSecondString = t.charAt(i);

            if(characterHashMap.containsKey(charOfFirstString) == true) {
                if(characterHashMap.get(charOfFirstString) != charOfSecondString) {
                    return false;
                }
            } else {
                if(characterCheckHashmap.containsKey(charOfSecondString) == true) {
                    return false;
                } else {
                    characterHashMap.put(charOfFirstString, charOfSecondString);
                    characterCheckHashmap.put(charOfSecondString, true);
                }
            }
        }

        return true;

    }
}
