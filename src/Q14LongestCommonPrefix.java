public class Q14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int stringLength = 0;
        if(strs.length == 0) {
            return prefix;
        }
        while(true) {

            char prefixCharacter = ' ';

            for(int i = 0; i < strs.length; i++) {
                if (stringLength > strs[i].length() - 1 ) {
                    return prefix;
                }
                if( i == 0) {
                    prefixCharacter = strs[0].charAt(stringLength);
                }
                if(prefixCharacter == strs[i].charAt(stringLength)) {

                    if(i == strs.length - 1) {
                        prefix = prefix + prefixCharacter;
                    }

                } else {
                    return prefix;
                }
            }
            stringLength++;

        }
    }
}
