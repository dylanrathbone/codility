/*
An anagram is passed (random letters) in, the algorithm
asses whether that string can be converted into a
plaindrome based on the rules below:

You can have infinite number of character appearances,
so long as those characters appear an even number of
times. However you can only have 0 or 1 appearances of
a character that appears an odd number of times
 */

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