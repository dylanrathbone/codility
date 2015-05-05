import org.junit.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    private Solution solution;

    @Before
    public void initialize() {
        solution = new Solution();
    }

    @Test
    public void integerThatAppearsMostOftenShouldBeNumberThree(){
        int integers [] = {1, 2, 3, 3, 4, 5};
        assertThat(solution.solution(integers), is(3));
    }

    @Test
    public void integerThatAppearsMostOftenShouldBe10(){
        int integers [] = {1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};
        assertThat(solution.solution(integers), is(10));
    }

}
