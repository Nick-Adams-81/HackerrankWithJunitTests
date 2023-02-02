import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CountingValleysTest {
    private String trail;

    @Before
    public void setUp() {
         trail = "duuudddduuu";
    }

    @Test
    public void testIfStringIsInitialized() {
        assertNotNull(trail);
    }

    @Test
    public void testIfTrailCountsValleys() {
        var countValleys = new CountingValleys();
        assertEquals(2, countValleys.countValleys(trail));
    }
}
