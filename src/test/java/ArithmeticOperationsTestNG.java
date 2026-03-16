import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperationsTestNG {

    @Test
    public void testAddition() {
        Assert.assertEquals(ArithmeticOperations.add(3, 4), 7);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(ArithmeticOperations.subtract(3, 4), -1);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(ArithmeticOperations.multiply(3, 4), 12);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(ArithmeticOperations.divide(8, 4), 2.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticOperations.divide(5, 0);
    }
}