package Java.multibracketvalidation;

import org.junit.Test;
import static org.junit.Assert.*;

public class multiBracketValidationTest {
    @Test
    public void testJustBracketsFalse() {
        multiBracketValidation testing = new multiBracketValidation();
        assertFalse(testing.multiBracketValidation("{(})"));
    }

    @Test
    public void testJustBracketsTrue() {
        multiBracketValidation testing = new multiBracketValidation();
        assertTrue(testing.multiBracketValidation("{}([])"));
    }

    @Test
    public void bracketPlusTrue() {
        multiBracketValidation testing = new multiBracketValidation();
        assertTrue(testing.multiBracketValidation("{}(HeyHey)()"));
    }

    @Test
    public void bracketPlusTrueTwo() {
        multiBracketValidation testing = new multiBracketValidation();
        assertTrue(testing.multiBracketValidation("{}{Code}[Fellows](())"));
    }

    @Test
    public void bracketPlusFalse() {
        multiBracketValidation testing = new multiBracketValidation();
        assertFalse(testing.multiBracketValidation("[({}]"));
    }

    @Test
    public void bracketPlusFalseTwo() {
        multiBracketValidation testing = new multiBracketValidation();
        assertFalse(testing.multiBracketValidation("{(})"));
    }

}