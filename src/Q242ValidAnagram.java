import java.util.HashMap;

public class Q242ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> characterCheckHashmap = new HashMap<Character, Integer>();

        for(int i = 0; i<s.length(); i++) {

            char currentChar = s.charAt(i);

            if(characterCheckHashmap.containsKey(currentChar) == false) { ;
                characterCheckHashmap.put(currentChar,1);
            } else {
                int currentFrequency = characterCheckHashmap.get(currentChar);
                characterCheckHashmap.put(currentChar, currentFrequency + 1);
            }
        }
        System.out.println(characterCheckHashmap);

        for(int i = 0; i<s.length(); i++) {
            char currentChar = t.charAt(i);
            if(characterCheckHashmap.containsKey(currentChar) == false || characterCheckHashmap.get(currentChar) == 0 ){
                return false;
            } else {
                int currentFrequency = characterCheckHashmap.get(currentChar);
                characterCheckHashmap.put(currentChar, currentFrequency - 1);
                System.out.println(characterCheckHashmap);
            }
        }
        return true;
    }
}
