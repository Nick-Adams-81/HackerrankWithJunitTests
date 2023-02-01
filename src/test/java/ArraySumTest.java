
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class ArraySumTest {



    public static int[] myArr = {1, 2, 3, 4, 5};



    @Test
    public void testIfInitialized() {
        assertNotNull(myArr);
    }

    @Test
    public void TestArraySum() {
        var arraySum = new ArraySum();
        assertNotNull(myArr);
        assertEquals(15, arraySum.arraySum(myArr));
        assertNotEquals(11, arraySum.arraySum(myArr));
        assertSame(1, myArr[0]);
        assertNotSame(2, myArr[3]);
    }
}
