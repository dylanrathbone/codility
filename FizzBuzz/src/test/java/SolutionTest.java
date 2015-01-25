import org.junit.*;
import static org.junit.Assert.*;


public class SolutionTest {

private Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void shouldReturnFizzIfDivisableByThree(){
        int[] array = {6};
        assertEquals("Fizz", solution.calculateWord(array));
    }

    @Test
    public void shouldReturnBuzzIfDivisableByFive(){
        int[] array = {10};
        assertEquals("Buzz", solution.calculateWord(array));
    }

    @Test
    public void shouldReturnFizzIfDivisableByThreeAndFive(){
        int[] array = {15};
        assertEquals("Fizz", solution.calculateWord(array));
    }

    @Test
    public void shouldReturnNumberIfNotDivisableByThreeOrFive(){
        int[] array = {2};
        assertEquals("2", solution.calculateWord(array));
    }

    @Test
    public void shouldReturnFizzFizzFizzBuzz1(){
        int[] array = {3, 6, 9, 10, 1};
        assertEquals("Fizz,Fizz,Fizz,Buzz,1", solution.calculateWord(array));
    }

    @Test
    public void shouldReturnFizzFizzFizzBuzzFizz14FizzBuzz() {
        int[] array = {3, 6, 9, 10, 12, 14, 15, 20};
        assertEquals("Fizz,Fizz,Fizz,Buzz,Fizz,14,Fizz,Buzz", solution.calculateWord(array));
    }
}
