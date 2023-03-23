package Info;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;

import static Info.Utilities.isAlpha;
import static Info.Utilities.isNumeric;

class SubjectTest {
    private String subjectName;
    private String subjectCode;
    private int fullMark;

    @Test
    public void testSetSubjectName() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(InvalidNameException.class, () -> subject.setSubjectName(" Math"));
        Assertions.assertThrows(InvalidNameException.class, () -> subject.setSubjectName("Math1"));
        Assertions.assertDoesNotThrow(() -> subject.setSubjectName("Math"));
    }

    @Test
    public void testSetSubjectCode() {
        Subject subject = new Subject("Math", "MAT101", 100);
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("MAT1010"));
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("MAT10A"));
        Assertions.assertThrows(Exception.class, () -> subject.setSubjectCode("MAT101s"));
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT101"));
        Assertions.assertDoesNotThrow(() -> subject.setSubjectCode("MAT101s"));
    }

    @Test
    public void testSetFullMark() {
        Subject subject = new Subject("Math", "MAT101", 100);
        subject.setFullMark(50);
        Assertions.assertEquals(50, subject.getFullMark());
    }

}
