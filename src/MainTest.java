import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    int[] inputArray1 = { 1, 4, 5, 3, 5, 9, 8, 5 };
    int[] inputArray2 = {};
    int[] inputArray3 = { 1, -1, -5, 5, 1 };
    int[] inputArray4 = { 0, -1, -5, 5, 1 };

    @Test
    public void testGetSum1() {
        assertEquals(Main.getSum(inputArray1), 40);
    }

    @Test
    public void testGetSum2() {
        assertEquals(Main.getSum(inputArray2), 0);
    }

    @Test
    public void testGetSum3() {
        assertEquals(Main.getSum(inputArray3), 1);
    }

    @Test
    public void testGetProduct1() {
        assertEquals(Main.getProduct(inputArray1), 108000);
    }

    @Test
    public void testGetProduct2() {
        assertEquals(Main.getProduct(inputArray2), 0);
    }

    @Test
    public void testGetProduct3() {
        assertEquals(Main.getProduct(inputArray3), 25);
    }

    @Test
    public void testGetProduct4() {
        assertEquals(Main.getProduct(inputArray4), 0);
    }
}
