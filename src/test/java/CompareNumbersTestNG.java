import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareNumbersTestNG {

    @Test
    public void testGreater() {
        Assert.assertEquals(CompareNumbers.compare(5, 3), "greater");
    }

    @Test
    public void testLess() {
        Assert.assertEquals(CompareNumbers.compare(2, 7), "less");
    }

    @Test
    public void testEqual() {
        Assert.assertEquals(CompareNumbers.compare(4, 4), "equal");
    }
}