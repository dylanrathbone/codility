import org.junit.*;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int A = 11;
        int B = 19;
        assertEquals(4, solution.checkForPrimesInRange(A, B));
    }

//    @Test
//    public void test2() {
//        int A = 2;
//        int B = 1000000;
//        assertEquals(78497, solution.checkForPrimesInRange(A, B));
//    }

}
