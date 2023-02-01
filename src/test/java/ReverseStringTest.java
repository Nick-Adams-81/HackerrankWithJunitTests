import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ReverseStringTest {

    private List<String> names;
    @Before
    public void setUp() {
        this.names = new ArrayList<>();
        this.names.add("nick");
        this.names.add("dave");

    }

    @Test
    public void testIfNamesInitalized() {
        assertNotNull(names);
    }

    @Test
    public void testReverseStringMethod() {
        var reverseString = new ReverseString();
        assertEquals("kcin", reverseString.ReverseString(names.get(0)));
        assertNotEquals("dave", reverseString.ReverseString(names.get(1)));
        assertEquals(2, this.names.size());
        names.add("zack");
        assertEquals(3, this.names.size());
        assertSame("zack", this.names.get(2));
    }

}
