import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    int[] inputArray1 = { 1, 4, 5, 3, 5, 9, 8, 5 };
    int[] inputArray2 = {};
    int[] inputArray3 = { 1, -1, -5, 5, 1 };

    @Test
    public void testSummation1() {
        assertEquals(Main.getSum(inputArray1), 40);
    }

    @Test
    public void testSummation2() {
        assertEquals(Main.getSum(inputArray2), 0);
    }

    @Test
    public void testSummation3() {
        assertEquals(Main.getSum(inputArray3), 1);
    }
}
