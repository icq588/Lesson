import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaTest {

    @Test
    void testTriangleArea() {
        assertEquals(6.0, TriangleArea.area(3, 4, 5));
    }

    @Test
    void testZeroAreaTriangle() {
        assertEquals(0.0, TriangleArea.area(1, 1, 2), 1e-9);
    }
}