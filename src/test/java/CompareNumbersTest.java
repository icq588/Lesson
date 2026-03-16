import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompareNumbersTest {

    @Test
    void testGreater() {
        assertEquals("greater", CompareNumbers.compare(5, 3));
    }

    @Test
    void testLess() {
        assertEquals("less", CompareNumbers.compare(2, 7));
    }

    @Test
    void testEqual() {
        assertEquals("equal", CompareNumbers.compare(4, 4));
    }
}