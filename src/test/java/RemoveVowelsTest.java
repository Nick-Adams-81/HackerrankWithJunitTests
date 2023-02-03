import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    private String str;

    @Before
    public void setUp() {
        this.str = "hello world";
    }

    @Test
    public void testToSeeIfSetUpWorked() {
        assertNotNull(str);
    }

    @Test
    public void removeVowelsTest() {
        var removeVowels = new RemoveVowels();
        assertEquals("hll wrld", removeVowels.removeVowels(str));
        assertNotEquals("hello world", removeVowels.removeVowels(str));
    }
}
