import java.util.ArrayList;

/**
 * Created by dylanrathbone on 24/01/15.
 */
public class Solution {

    private ArrayList<String> list = new ArrayList<String>();
    private StringBuilder sb = new StringBuilder();

    public String calculateWord(int[] numberArray) {

        determineWhetherNumberIsFizzOrBuzz(numberArray);

        if(list.size() >= 1) {
            buildStringWIthDelimeters();
        } else {
            buildStringWithNoDelimeter();
        }

        return removeLastComma();
    }

    private void buildStringWithNoDelimeter() {
        sb.append(list.get(1));
    }

    private String removeLastComma() {
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    private void buildStringWIthDelimeters() {
        for(String element : list){
            sb.append(element);
            sb.append(',');
        }
    }

    private void determineWhetherNumberIsFizzOrBuzz(int[] numberArray) {
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
