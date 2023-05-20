package Testing.Utilities;

import Info.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUtilities {

    // Testing for the Utilities class to ensure that the isAlpha method works correctly (correct input)
    @Test
    public void testIsAlpha() {
        Assertions.assertTrue(Utilities.isAlpha("abc"));
    }

    // Testing for the Utilities class to ensure that the isAlpha method works correctly (correct input)
    @Test
    public void testIsAlpha1() {
        Assertions.assertTrue(Utilities.isAlpha("ABC"));
    }

    // Testing for the Utilities class to ensure that the isAlpha method works correctly (incorrect input numeric values)
    @Test
    public void testIsAlpha2() {
        Assertions.assertFalse(Utilities.isAlpha("123"));
    }

    // Testing for the Utilities class to ensure that the isAlpha method works correctly (incorrect input alphanumeric values)
    @Test
    public void testIsAlpha3() {
        Assertions.assertFalse(Utilities.isAlpha("abc123"));
    }

    // Testing for the Utilities class to ensure that the isAlpha method works correctly (incorrect input special characters)
    @Test
    public void testIsAlpha4() {
        Assertions.assertFalse(Utilities.isAlpha("abc!"));
    }

    // Testing for the Utilities class to ensure that the isAlpha method works correctly (incorrect input space)
    @Test
    public void testIsAlpha5() {
        Assertions.assertFalse(Utilities.isAlpha(" "));
    }

    // Testing for the Utilities class to ensure that the isAlpha method works correctly (incorrect input null)
    @Test
    public void testIsAlpha6() {
        Assertions.assertFalse(Utilities.isAlpha(null));
    }

    // Testing for the Utilities class to ensure that the isNumeric method works correctly (correct input)
    @Test
    public void testIsNumeric() {
        Assertions.assertTrue(Utilities.isNumeric("123"));
    }

    // Testing for the Utilities class to ensure that the isNumeric method works correctly (incorrect input alphabetic values)
    @Test
    public void testIsNumeric1() {
        Assertions.assertFalse(Utilities.isNumeric("abc"));
    }

    // Testing for the Utilities class to ensure that the isNumeric method works correctly (incorrect input alphanumeric values)
    @Test
    public void testIsNumeric2() {
        Assertions.assertFalse(Utilities.isNumeric("abc123"));
    }

    // Testing for the Utilities class to ensure that the isNumeric method works correctly (incorrect input special characters)
    @Test
    public void testIsNumeric3() {
        Assertions.assertFalse(Utilities.isNumeric("123!"));
    }

    // Testing for the Utilities class to ensure that the isNumeric method works correctly (incorrect input space)
    @Test
    public void testIsNumeric4() {
        Assertions.assertFalse(Utilities.isNumeric(" "));
    }

    // Testing for the Utilities class to ensure that the isNumeric method works correctly (incorrect input null)
    @Test
    public void testIsNumeric5() {
        Assertions.assertFalse(Utilities.isNumeric(null));
    }

    // Testing for the Utilities class to ensure that the isAlphaNumeric method works correctly (correct input)
    @Test
    public void testIsAlphaNumeric() {
        Assertions.assertTrue(Utilities.isAlphaNumeric("abc123"));
    }

    // Testing for the Utilities class to ensure that the isAlphaNumeric method works correctly (correct input)
    @Test
    public void testIsAlphaNumeric1() {
        Assertions.assertTrue(Utilities.isAlphaNumeric("ABC123"));
    }

    // Testing for the Utilities class to ensure that the isAlphaNumeric method works correctly (special characters)
    @Test
    public void testIsAlphaNumeric2() {
        Assertions.assertFalse(Utilities.isAlphaNumeric("abc!"));
    }

    // Testing for the Utilities class to ensure that the isAlphaNumeric method works correctly (incorrect input special characters)
    @Test
    public void testIsAlphaNumeric3() {
        Assertions.assertFalse(Utilities.isAlphaNumeric("123!"));
    }

    // Testing for the Utilities class to ensure that the isAlphaNumeric method works correctly (incorrect input space)
    @Test
    public void testIsAlphaNumeric4() {
        Assertions.assertFalse(Utilities.isAlphaNumeric(" "));
    }

    // Testing for the Utilities class to ensure that the isAlphaNumeric method works correctly (incorrect input null)
    @Test
    public void testIsAlphaNumeric5() {
        Assertions.assertFalse(Utilities.isAlphaNumeric(null));
    }
}