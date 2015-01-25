import org.junit.*;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void shouldReturn3ForTotalNumberOfJumps() {
        int x =10;
        int y = 85;
        int d = 30;
        assertEquals(3, solution.getMinimumNumberOfJumps(x, y, d));
    }

    @Test
    public void shouldReturn10ForTotalNumberOfJumps() {
        int x =0;
        int y = 100;
        int d = 10;
        assertEquals(10, solution.getMinimumNumberOfJumps(x, y, d));
    }

    @Test
    public void shouldReturn2ForTotalNumberOfJumps() {
        int x =20;
        int y = 80;
        int d = 30;
        assertEquals(2, solution.getMinimumNumberOfJumps(x, y, d));
    }

    @Test
    public void shouldReturn9ForTotalNumberOfJumps() {
        int x =1;
        int y = 10;
        int d = 1;
        assertEquals(9, solution.getMinimumNumberOfJumps(x, y, d));
    }

    @Test
    public void shouldReturnForTotalNumberOfJumps() {
        int x =10;
        int y = 10290010;
        int d = 1;
        assertEquals(10290000, solution.getMinimumNumberOfJumps(x, y, d));
    }

}


