import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    Factorial calculator = new Factorial();

    @Test

    public void testFactorialZero() {
        Assert.assertEquals(calculator.factorial(0), 1);
    }

    @Test
    public void testFactorialPositiveNumber() {
        Assert.assertEquals(calculator.factorial(10), 3628800);
    }

    @Test

    public void testFactorialNegativeNumber() {

        try {
            calculator.factorial(-5);
            Assert.fail("Number is negative");
        } catch (IllegalArgumentException e) {

        }
    }
}