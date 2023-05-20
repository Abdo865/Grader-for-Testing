package Testing.Utilities;

import Info.Subject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;

import static org.junit.Assert.assertEquals;

public class conditionCoverageTest {
    @Test
    public void testSetSubjectName() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows( InvalidNameException.class, () -> subject.setSubjectName(" Math"));
    }

    @Test
    public void testSetSubjectName1() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows( InvalidNameException.class, () -> subject.setSubjectName("Math123"));
    }

    @Test
    public void testSetSubjectName2() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        String expectedName = "Mathematics";
        subject.setSubjectName("Mathematics");
        assertEquals(expectedName, subject.getSubjectName());
    }


    @Test
    public void testSetSubjectCodeLengthTooShort() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("MAT10"));
    }

    @Test
    public void testSetSubjectCodeLengthTooLong() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("Mathematics101"));
    }

    @Test
    public void testSetSubjectCodeInvalidFormat() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("12A123"));
    }

    @Test
    public void testSetSubjectCodeInvalidFormat1() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("MATM23"));
    }

    @Test
    public void testSetSubjectCodeInvalidEnding() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("ABC123X"));
    }

    @Test
    public void testValidSubjectCode6Chars() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        String subjectCode = "ABC123";
        subject.setSubjectCode("ABC123");
        assertEquals(subjectCode, subject.getSubjectCode());
    }

    @Test
    public void testValidSubjectCode7Chars() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        String subjectCode = "ABC123s";
        subject.setSubjectCode("ABC123s");
        assertEquals(subjectCode, subject.getSubjectCode());
    }
}
