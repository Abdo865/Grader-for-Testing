package Testing.Utilities;

import Info.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StudentTest {

    @Test
    public void testSetName() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setName(" John"));
    }

    @Test
    public void testSetName1() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setName("123"));
    }

    @Test
    public void testSetName2() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setName("John"));
    }

    @Test
    public void testSetNumber() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setNumber("1234567"));
    }

    @Test
    public void testSetNumber1() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setNumber("1234567a"));
    }

    @Test
    public void testSetNumber2() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setNumber("12345678a"));
    }

    @Test
    public void testSetActivities() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setActivities(11));
    }

    @Test
    public void testSetActivities1() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setActivities(-1));
    }

    @Test
    public void testSetActivities2() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setActivities(5));
    }

    @Test
    public void testSetMidterm() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setMidterm(21));
    }

    @Test
    public void testSetMidterm1() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setMidterm(-1));
    }

    @Test
    public void testSetMidterm2() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setMidterm(10));
    }

    @Test
    public void testSetOral() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setOral(11));
    }

    @Test
    public void testSetOral1() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setOral(-1));
    }

    @Test
    public void testSetOral2() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setOral(5));
    }

    @Test
    public void testSetFinal() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setFinal(61));
    }

    @Test
    public void testSetFinal1() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() ->  student.setFinal(-1));
    }

    @Test
    public void testSetFinal2() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setFinal(30));
    }

    @Test
    public void testSetGrade() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        student.setMidterm(10);
    }

    @Test
    public void testSetGrade1() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        student.setOral(5);
    }

    @Test
    public void testSetGrade2() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        student.setFinal(30);
    }

    @Test
    public void testSetGrade3() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        student.setGrade();
    }

    @Test
    public void testSetGrade4() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertEquals("F", student.getGrade());
    }

    @Test
    public void testSetGrade5() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertEquals(0, student.getGPA());
    }
}