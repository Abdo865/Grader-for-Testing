package Testing.Utilities;

import Info.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUtilities {
    @Test
    public void testIsAlpha() {
        Assertions.assertTrue(Utilities.isAlpha("abc"));
    }

    @Test
    public void testIsAlpha1() {
        Assertions.assertTrue(Utilities.isAlpha("ABC"));
    }

    @Test
    public void testIsAlpha2() {
        Assertions.assertTrue(Utilities.isAlpha("123"));
    }

    @Test
    public void testIsAlpha3() {
        Assertions.assertTrue(Utilities.isAlpha("abc123"));
    }

    @Test
    public void testIsAlpha4() {
        Assertions.assertTrue(Utilities.isAlpha("abc!"));
    }

    @Test
    public void testIsAlpha5() {
        Assertions.assertTrue(Utilities.isAlpha(" "));
    }

    @Test
    public void testIsAlpha6() {
        Assertions.assertTrue(Utilities.isAlpha(null));
    }

    @Test
    public void testIsNumeric() {
        Assertions.assertTrue(Utilities.isNumeric("123"));
    }

    @Test
    public void testIsNumeric1() {
        Assertions.assertTrue(Utilities.isNumeric("abc"));
    }

    @Test
    public void testIsNumeric2() {
        Assertions.assertTrue(Utilities.isNumeric("abc123"));
    }

    @Test
    public void testIsNumeric3() {
        Assertions.assertTrue(Utilities.isNumeric("123!"));
    }

    @Test
    public void testIsNumeric4() {
        Assertions.assertTrue(Utilities.isNumeric(" "));
    }

    @Test
    public void testIsNumeric5() {
        Assertions.assertTrue(Utilities.isNumeric(null));
    }

    @Test
    public void testIsAlphaNumeric() {
        Assertions.assertTrue(Utilities.isAlphaNumeric("abc123"));
    }

    @Test
    public void testIsAlphaNumeric1() {
        Assertions.assertTrue(Utilities.isAlphaNumeric("ABC123"));
    }

    @Test
    public void testIsAlphaNumeric2() {
        Assertions.assertTrue(Utilities.isAlphaNumeric("abc!"));
    }

    @Test
    public void testIsAlphaNumeric3() {
        Assertions.assertTrue(Utilities.isAlphaNumeric("123!"));
    }

    @Test
    public void testIsAlphaNumeric4() {
        Assertions.assertTrue(Utilities.isAlphaNumeric(" "));
    }

    @Test
    public void testIsAlphaNumeric5() {
        Assertions.assertTrue(Utilities.isAlphaNumeric(null));
    }
}