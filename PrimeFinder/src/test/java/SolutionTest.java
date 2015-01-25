import org.junit.*;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test0() {
        int A = 245;
        int B = 1022;
        assertEquals(119, solution.checkForPrimesInRange(A, B));
    }

    @Test
    public void test1() {
        int A = 11;
        int B = 19;
        assertEquals(4, solution.checkForPrimesInRange(A, B));
    }

    @Test
    public void test2() {
        int A = 1;
        int B = 3;
        assertEquals(2, solution.checkForPrimesInRange(A, B));
    }

    @Test
    public void test4() {
        int A = 6;
        int B = 23340;
        assertEquals(2600, solution.checkForPrimesInRange(A, B));
    }

    @Test
    public void test3() {
        int A = 2;
        int B = 500000;
        assertEquals(41538, solution.checkForPrimesInRange(A, B));
    }

    @Test
    public void test6() {
        int A = 0;
        int B = 1;
        assertEquals(0, solution.checkForPrimesInRange(A, B));
    }

    @Test
    public void test7() {
        int A = 1;
        int B = 1000000;
        assertEquals(78498, solution.checkForPrimesInRange(A, B));
    }

}
