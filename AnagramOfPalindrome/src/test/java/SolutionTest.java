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
        String s = "kayak";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test2() {
        String s = "neveroddoreven";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test4() {
        String s = "codilitydytilidoc";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test5() {
        String s = "pop";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test17() {
        String s = "eeeeemm";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test18() {
        String s = "vvvillittleoolive";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test6() {
        String s = "eye";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test7() {
        String s = "radar";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test10() {
        String s = "e";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test11() {
        String s = "evil olive";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test12() {
        String s = "doomsmoods";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test15() {
        String s = "dooernedeevrvn";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test16() {
        String s = "codilitytilidoc";
        assertEquals(1, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test14() {
        String s = "pops";
        assertEquals(0, solution.checkStringIsAnagramOfPalindrome(s));
    }

    @Test
    public void test13() {
        String s = "aabcba";
        assertEquals(0, solution.checkStringIsAnagramOfPalindrome(s));
    }

}