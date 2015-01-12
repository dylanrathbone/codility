public class Solution {

    public int solution(int A, int B) {
        return checkForPrimesInRange(A, B);
    }

    public int checkForPrimesInRange(int A, int B) {

        int totalNumberOfPrimes = 0;

        while (A <= B) {
            if(isItPrime(A)) {
                totalNumberOfPrimes++;
            }
            A++;
        }
        return totalNumberOfPrimes;
    }

    private boolean isItPrime(int value) {
        if(value % 2 == 0) {
            return false;
        }
        for(int i = 3; i * i <= value; i += 2)
            if (value % i == 0) {
                return false;
            }
        return true;
    }
}