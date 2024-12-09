package Task3_SumOfDigits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest {
    @Test
    public void testPositiveNumber() {
        assertEquals(15, SumOfDigits.sumOfDigits(12345));
    }

    @Test
    public void testZero() {
        assertEquals(0, SumOfDigits.sumOfDigits(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(15, SumOfDigits.sumOfDigits(-12345));
    }
}
