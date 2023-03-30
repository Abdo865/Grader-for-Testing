package Testing.Utilities;

import Info.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUtilities {
    @Test
    public void testIsAlpha() {
        Assertions.assertTrue(Utilities.isAlpha("abc"));
        Assertions.assertTrue(Utilities.isAlpha("ABC"));
        Assertions.assertFalse(Utilities.isAlpha("123"));
        Assertions.assertFalse(Utilities.isAlpha("abc123"));
        Assertions.assertFalse(Utilities.isAlpha("abc!"));
        Assertions.assertFalse(Utilities.isAlpha(" "));
        Assertions.assertFalse(Utilities.isAlpha(null));
    }

    @Test
    public void testIsNumeric() {
        Assertions.assertTrue(Utilities.isNumeric("123"));
        Assertions.assertFalse(Utilities.isNumeric("abc"));
        Assertions.assertFalse(Utilities.isNumeric("abc123"));
        Assertions.assertFalse(Utilities.isNumeric("123!"));
        Assertions.assertFalse(Utilities.isNumeric(" "));
        Assertions.assertFalse(Utilities.isNumeric(null));
    }

    @Test
    public void testIsAlphaNumeric() {
        Assertions.assertTrue(Utilities.isAlphaNumeric("abc123"));
        Assertions.assertTrue(Utilities.isAlphaNumeric("ABC123"));
        Assertions.assertFalse(Utilities.isAlphaNumeric("abc!"));
        Assertions.assertFalse(Utilities.isAlphaNumeric("123!"));
        Assertions.assertFalse(Utilities.isAlphaNumeric(" "));
        Assertions.assertFalse(Utilities.isAlphaNumeric(null));
    }
}