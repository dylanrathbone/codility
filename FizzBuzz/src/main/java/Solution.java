import java.util.ArrayList;

/**
 * Created by dylanrathbone on 24/01/15.
 */
public class Solution {

    public String calculateWord(int[] numberArray) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();

        fizzBuzzGenerator(numberArray, list);
        addDelimeter(sb, list);
        return removeLastComma(sb);
    }

    private String removeLastComma(StringBuilder sb) {
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    private void addDelimeter(StringBuilder sb, ArrayList<String> list) {
        if(list.size() >= 1){
            for(String element : list){
                sb.append(element);
                sb.append(',');
            }
        } else {
            sb.append(list.get(1));
        }
    }

    private void fizzBuzzGenerator(int[] numberArray, ArrayList<String> list) {
        for (int element : numberArray) {
            if(element % 3 == 0 && element % 5 == 0) {
                list.add("Fizz");
            } else if (element % 3 == 0) {
                list.add("Fizz");
            } else if (element % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(element));
            }
        }
    }
}
