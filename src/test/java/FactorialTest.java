import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FactorialTest {

    @Test

     void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(39916800, Factorial.factorial(11));
    }

    @Test
    void testFactorialNegativeNumber() {
         assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-5));
    }
}