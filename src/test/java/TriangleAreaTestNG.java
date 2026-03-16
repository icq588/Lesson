import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTestNG {

    @Test
    public void testTriangleArea() {
        Assert.assertEquals(TriangleArea.area(3, 4, 5), 6.0);
    }

    @Test
    public void testZeroAreaTriangle() {
        Assert.assertEquals(TriangleArea.area(1, 1, 2), 0.0, 1e-9);
    }
}