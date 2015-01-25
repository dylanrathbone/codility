/**
 * Created by dylanrathbone on 24/01/15.
 */
public class Solution {
    public int solution(int X, int Y, int D) {
        return getMinimumNumberOfJumps(X, Y, D);
    }

    public int getMinimumNumberOfJumps(int x, int y, int d) {
        int distanceTraveled = 0;
        while(x < y) {
            x = x + d;
            distanceTraveled++;
        }
        return distanceTraveled;
    }
}
