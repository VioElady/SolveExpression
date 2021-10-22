package mathexpression;

import mathexpression.ast.Expression;
import mathexpression.exception.InvalidExpressionException;
import mathexpression.parser.Parser;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MathExpressionTest {

    @Test
    public void sum() {
        Parser parser = new Parser();
        Expression expr = parser.parse("5+5+6");
        assertEquals(16.0, expr.evaluate());
    }

    @Test
    public void division() {
        Parser parser = new Parser();
        Expression expr = parser.parse("5/5");
        assertEquals(1.0, expr.evaluate());
    }

    @Test
    public void expression() {
        Parser parser = new Parser();
        Expression expr = parser.parse("4-(5*4)");
        assertEquals(-16.0, expr.evaluate());
    }

    @Test
    public void expression2() {
        Parser parser = new Parser();
        Expression expr = parser.parse("4/2-(5+4)*2");
        assertEquals(-16.0, expr.evaluate());
    }

    @Test
    public void multiplication() {
        Parser parser = new Parser();
        Expression expr = parser.parse("5*5");
        assertEquals(25.0, expr.evaluate());
    }

    @Test(expected = InvalidExpressionException.class)
    public void invalidExpression() {
        Parser parser = new Parser();
        parser.parse("a+b");

    }


}