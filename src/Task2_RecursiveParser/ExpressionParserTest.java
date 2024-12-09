package Task2_RecursiveParser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExpressionParserTest {
    @Test
    public void testSimpleExpression() {
        assertEquals(13.0, ExpressionParser.evaluateExpression("3 + 5 * 2"));
    }

    @Test
    public void testExpressionWithParentheses() {
        assertEquals(16.0, ExpressionParser.evaluateExpression("3 + (5 * 2)"));
    }

    @Test
    public void testExpressionWithDivision() {
        assertEquals(7.0, ExpressionParser.evaluateExpression("14 / 2"));
    }

    @Test
    public void testInvalidExpression() {
        assertThrows(NumberFormatException.class, () -> {
            ExpressionParser.evaluateExpression("3 + * 2");
        });
    }
}
