package Testing.Utilities;
import Info.Student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;


public class StudentTest {
    //    private String name;
    //    private String number;
    //    private String grade;
    //    private float GPA;
    //    private int activities;
    //    private int oral;
    //    private int midterm;
    //    private int Final;

    @Test
    public void testSetName() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(InvalidNameException.class, () -> student.setName(" John"));
        Assertions.assertThrows(InvalidNameException.class, () -> student.setName("123"));
        Assertions.assertDoesNotThrow(() -> student.setName("John"));
    }

    @Test
    public void testSetNumber() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("1234567"));
        Assertions.assertThrows(Exception.class, () -> student.setNumber("1234567a"));
        Assertions.assertDoesNotThrow(() -> student.setNumber("12345678a"));
    }

    @Test
    public void testSetActivities() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setActivities(11));
        Assertions.assertThrows(Exception.class, () -> student.setActivities(-1));
        Assertions.assertDoesNotThrow(() -> student.setActivities(5));
    }

    @Test
    public void testSetMidterm() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setMidterm(21));
        Assertions.assertThrows(Exception.class, () -> student.setMidterm(-1));
        Assertions.assertDoesNotThrow(() -> student.setMidterm(10));
    }

    @Test
    public void testSetOral() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setOral(11));
        Assertions.assertThrows(Exception.class, () -> student.setOral(-1));
        Assertions.assertDoesNotThrow(() -> student.setOral(5));
    }

    @Test
    public void testSetFinal() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setFinal(61));
        Assertions.assertThrows(Exception.class, () -> student.setFinal(-1));
        Assertions.assertDoesNotThrow(() -> student.setFinal(30));
    }

    @Test
    public void testSetGrade() {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        student.setMidterm(10);
        student.setOral(5);
        student.setFinal(30);
        student.setGrade();
        Assertions.assertEquals("F", student.getGrade());
        Assertions.assertEquals(0, student.getGPA());
    }
}