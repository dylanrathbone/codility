public class Solution {

    public int solution(int A, int B) {
        return checkForPrimesInRange(A, B);
    }

    public int checkForPrimesInRange(int A, int B) {
        int totalNumberOfPrimesFound = 0;
        while (A <= B) {
            if(isItPrime(A)) {
                totalNumberOfPrimesFound++;
            }
            A++;
        }
        return totalNumberOfPrimesFound;
    }

    private boolean isItPrime(int valueToCheck) {
        //If value is less than 2 i.e 1 or 0 then it cannot be prime because those numbers are not prime
        if (valueToCheck < 2) {
            return false;
        }
        //All even numbers are divisible by 2.
        //So lets test if n is even and therefore not prime
        if (valueToCheck % 2 == 0) {
            //2 is the only even PRIME number so it
            //is an exception to the rule above
            //i.e. return true if value is 2
            return (valueToCheck == 2);
        }
        //only necessary to test the factors between 2 and the square root of n.
        //If the square root of n isn't a whole number, round up to
        //the nearest whole number and test up to this number instead. See below
        int ceiling = (int)Math.sqrt((double)valueToCheck);
        //i Starts at 3 because even numbers (which are multiples of 2) are not primes

        //Iterator starts at 3 because there is no point at starting at dividing
        //by 2 because we have already made that test above

        //We only check against odds now because, we have already checked above if the target is even and
        //therfore not prime using an even number i.e. 2.
        //By using even numbers (which are multiples of 2) for the test below we would essentially
        //be re-performing the same check above.
        for (int i = 3; i <= ceiling; i += 2)
        {
            if (valueToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}