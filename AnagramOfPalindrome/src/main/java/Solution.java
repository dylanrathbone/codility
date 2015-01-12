import java.util.*;

public class Solution {

    public int solution(String S) {

        return checkStringIsAnagramOfPalindrome(S);
    }

    public int checkStringIsAnagramOfPalindrome(String s) {
        int numberOfCharacterAppearances = 0;
        int oddCharacterCountAppearance = 0;
        String stringToCheck = s.replaceAll("\\s+", "");
        ArrayList<Character> checkedCharacters = new ArrayList<Character>();

        for (int z = 0; z<stringToCheck.length(); z++){
            if(!checkedCharacters.contains(stringToCheck.charAt(z))) {
                for (int y = 0; y < stringToCheck.length(); y++) {
                    if (stringToCheck.charAt(y) == stringToCheck.charAt(z)) {
                        numberOfCharacterAppearances++;
                        checkedCharacters.add(stringToCheck.charAt(z));
                    }
                }
            }
            if( numberOfCharacterAppearances % 2 != 0){
                oddCharacterCountAppearance++;
            }
            numberOfCharacterAppearances = 0;
        }
        if (oddCharacterCountAppearance <= 1) {
            return 1;
        }
        return 0;
    }
}