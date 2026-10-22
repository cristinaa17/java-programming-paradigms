package ex2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleCalculatorTest {

    @Test
    public void testAddPositive() {
        DoubleCalculator calc = new DoubleCalculator(5.5);
        calc.add(2.2);
        assertEquals(7.7, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testAddNegatives() {
        DoubleCalculator calc = new DoubleCalculator(5.5);
        calc.add(-1.5);
        assertEquals(4.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testSubtractPositives() {
        DoubleCalculator calc = new DoubleCalculator(10.0);
        calc.subtract(2.5);
        assertEquals(7.5, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testSubtractNegatives() {
        DoubleCalculator calc = new DoubleCalculator(10.0);
        calc.subtract(-3.0);
        assertEquals(13.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testMultiplyPositives() {
        DoubleCalculator calc = new DoubleCalculator(2.0);
        calc.multiply(3.5);
        assertEquals(7.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testMultiplyNegatives() {
        DoubleCalculator calc = new DoubleCalculator(2.0);
        calc.multiply(-3.0);
        assertEquals(-6.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testMultiplyBy0() {
        DoubleCalculator calc = new DoubleCalculator(2.0);
        calc.multiply(0);
        assertEquals(0.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testDividePositives() {
        DoubleCalculator calc = new DoubleCalculator(6.0);
        calc = calc.divide(2.0);
        assertEquals(3.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testDivideNegatives() {
        DoubleCalculator calc = new DoubleCalculator(6.0);
        calc = calc.divide(-2.0);
        assertEquals(-3.0, (Double) calc.result(), 0.0001);
    }

    @Test
    public void testDivideBy0() {
        DoubleCalculator calc = new DoubleCalculator(6.0);
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(0.0);
        });
    }
}
