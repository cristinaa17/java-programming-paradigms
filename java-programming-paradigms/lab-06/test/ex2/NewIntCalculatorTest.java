package ex2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NewIntCalculatorTest {

    @Test
    public void testAddPositive() {
        NewIntCalculator calc = new NewIntCalculator(10);
        calc.add(5);
        assertEquals(15, calc.result());
    }

    @Test
    public void testAddNegatives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        calc.add(-3);
        assertEquals(7, calc.result());
    }

    @Test
    public void testSubtractPositives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        calc.subtract(4);
        assertEquals(6, calc.result());
    }

    @Test
    public void testSubtractNegatives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        calc.subtract(-5);
        assertEquals(15, calc.result());
    }

    @Test
    public void testMultiplyPositives() {
        NewIntCalculator calc = new NewIntCalculator(4);
        calc.multiply(3);
        assertEquals(12, calc.result());
    }

    @Test
    public void testMultiplyNegatives() {
        NewIntCalculator calc = new NewIntCalculator(4);
        calc.multiply(-2);
        assertEquals(-8, calc.result());
    }

    @Test
    public void testMultiplyBy0() {
        NewIntCalculator calc = new NewIntCalculator(7);
        calc.multiply(0);
        assertEquals(0, calc.result());
    }

    @Test
    public void testDividePositives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        calc = calc.divide(2);
        assertEquals(5, calc.result());
    }

    @Test
    public void testDivideNegatives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        calc = calc.divide(-2);
        assertEquals(-5, calc.result());
    }

    @Test
    public void testDivideBy0() {
        NewIntCalculator calc = new NewIntCalculator(10);
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(0);
        });
    }
}