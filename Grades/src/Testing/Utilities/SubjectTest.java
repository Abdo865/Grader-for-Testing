package Testing.Utilities;

import Info.Subject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SubjectTest {


    // Test for the setName method space at the beginning of the name
    @Test
    public void testSetSubjectName() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectName(" Math"));
    }

    // Test for the setName method with invalid name that has numbers on it
    @Test
    public void testSetSubjectName1() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectName("Math1"));
    }

    // Test valid name
    @Test
    public void testSetSubjectName2() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectName("Math"));
    }

    // Test for the setSubjectCode method with number length less than 6 digits
    @Test
    public void testSetSubjectCode() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT1010"));
    }

    // Test for the setSubjectCode method with number length
    @Test
    public void testSetSubjectCode1() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("MAT10A"));
    }

    // Test for the setSubjectCode method with invalid format (it must be 3 letters then 3 numbers or with an s at the end)
    @Test
    public void testSetSubjectCode2() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT101s"));
    }

    // Test for the setSubjectCode method with non-alphanumeric character at the beginning (it must be 3 letters then 3 numbers or with an s at the end)
    @Test
    public void testSetSubjectCode3() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT101"));
    }

    @Test
    public void testSetFullMark() throws Exception {
        Subject subject = new Subject("Math", "MAT101", 100);
        subject.setFullMark(50);
        Assertions.assertEquals(50, subject.getFullMark());
    }
}