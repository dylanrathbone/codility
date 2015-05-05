public class Solution {

    private int currentElement;
    private int currentElementCount = 0;
    private int counter = 0;

    public int solution(int[] A) {
        return determineMostOften(A);
    }

    private int determineMostOften(int[]array){

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                    counter++;
                }
            }
            if(counter > currentElementCount){
                currentElementCount = counter;
                currentElement = array[i];
            }
            counter = 0;
        }
        return currentElement;
    }
}
