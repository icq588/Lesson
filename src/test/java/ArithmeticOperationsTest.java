import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testAddition() {
        assertEquals(7, ArithmeticOperations.add(3, 4));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1, ArithmeticOperations.subtract(3, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, ArithmeticOperations.multiply(3, 4));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, ArithmeticOperations.divide(8, 4));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(5, 0));
    }
}