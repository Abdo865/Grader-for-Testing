package Testing.Utilities;

import Info.Subject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;

import static org.junit.Assert.assertEquals;

public class conditionCoverageTest {

    /* ---------------- Condition Coverage Test ---------------- */

    // Test for the setName method space at the beginning of the name
    //path(1, 2, 3, 9)
    @Test
    public void testSetSubjectName() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(InvalidNameException.class, () -> subject.setSubjectName(" Math"));
    }

    // Test for the setName method with invalid name that has numbers on it
    //path(1, 2, 4, 5, 9)
    @Test
    public void testSetSubjectName1() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(InvalidNameException.class, () -> subject.setSubjectName("Math123"));
    }

    // Test valid name
    //path(1, 2, 4, 6 ,8, 9)
    @Test
    public void testSetSubjectName2() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        String expectedName = "Mathematics";
        subject.setSubjectName("Mathematics");
        assertEquals(expectedName, subject.getSubjectName());
    }

    // Test for the setSubjectCode method with number length less than 6 digits
    //path((1, 2, 3, 9)
    @Test
    public void testSetSubjectCodeLengthTooShort() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("MAT10"));
    }

    // Test for the setSubjectCode method with number length more than 7 digits
    //path((1, 2, 3, 9)
    @Test
    public void testSetSubjectCodeLengthTooLong() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("Mathematics101"));
    }

    // Test for the setSubjectCode method with invalid format (it must be 3 letters then 3 numbers or with an s at the end)
    //path(1, 2, 4, 5, 9)
    @Test
    public void testSetSubjectCodeInvalidFormat() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("12A123"));
    }

    // Test for the setSubjectCode method with non-alphanumeric character at the beginning (it must be 3 letters then 3 numbers or with an s at the end)
    //path(1, 2, 4, 5, 9)
    @Test
    public void testSetSubjectCodeInvalidFormat1() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("MATM23"));
    }

    // Test for the setSubjectCode method with something other than s at the end
    //path(1, 2, 4, 6, 7, 9)

    @Test
    public void testSetSubjectCodeInvalidEnding() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("ABC123X"));
    }

    // Test for the setSubjectCode method with valid format (without s)

    @Test
    public void testValidSubjectCode6Chars() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        String subjectCode = "ABC123";
        subject.setSubjectCode("ABC123");
        assertEquals(subjectCode, subject.getSubjectCode());
    }

    // Test for the setSubjectCode method with valid format (with s)
    //path (1, 2, 4, 6, 8, 9)
    @Test
    public void testValidSubjectCode7Chars() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        String subjectCode = "ABC123s";
        subject.setSubjectCode("ABC123s");
        assertEquals(subjectCode, subject.getSubjectCode());
    }
    /* --------------------------------------------------------------------------------- */
}
