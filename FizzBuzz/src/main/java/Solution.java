/**
 * Created by dylanrathbone on 24/01/15.
 */
public class Solution {

    public String calculateWord(int[] numberArray) {

        StringBuilder sb = new StringBuilder();

        for (int element : numberArray) {
            if(element % 3 == 0 && element % 5 == 0) {
                sb.append("Fizz");
            } else if (element % 3 == 0) {
                sb.append("Fizz");
            } else if (element % 5 == 0) {
                sb.append("Buzz");
            } else {
                sb.append(Integer.toString(element));
            }
        } return sb.toString();
    }

}
