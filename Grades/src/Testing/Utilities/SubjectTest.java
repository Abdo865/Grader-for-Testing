package Testing.Utilities;

import Info.Subject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SubjectTest {

    @Test
    public void testSetSubjectName() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectName(" Math"));
    }

    @Test
    public void testSetSubjectName1() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectName("Math1"));
    }

    @Test
    public void testSetSubjectName2() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectName("Math"));
    }

    @Test
    public void testSetSubjectCode() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT1010"));
    }

    @Test
    public void testSetSubjectCode1() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT10A"));
    }

    @Test
    public void testSetSubjectCode2() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT101s"));
    }

    @Test
    public void testSetSubjectCode3() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT101"));
    }

    @Test
    public void testSetFullMark() {
        Subject subject = new Subject("Math", "MAT101", 100);
        subject.setFullMark(50);
        Assertions.assertEquals(50, subject.getFullMark());
    }
}