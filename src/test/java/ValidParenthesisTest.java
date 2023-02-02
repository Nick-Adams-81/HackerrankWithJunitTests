import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisTest {

    private String validStr;
    private String invalidStr;

    @Before
    public void setUp() {
        this.validStr = "{[]}";
        this.invalidStr = "{[)";
    }

    @Test
    public void testIfStringIsInitialized() {
        assertNotNull(validStr);
        assertNotNull(invalidStr);
    }

    @Test
    public void testValidParenthesis() {
        var validParenthesis = new ValidParenthesis();
        assertTrue(validParenthesis.validParenthesis(validStr));
        assertFalse(validParenthesis.validParenthesis(invalidStr));

    }
}
