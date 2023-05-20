package Testing.Utilities;

import Info.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.InvalidNameException;

import static org.junit.Assert.assertEquals;

public class PathCoverageTest {

    @Test
    public void testStudentName() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(InvalidNameException.class, () -> student.setName(" John"));
    }

    @Test
    public void testStudentName1() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(InvalidNameException.class, () -> student.setName("John123"));

    }

    @Test
    public void testStudentName2() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        String expectedName = "youssef";
        student.setName("youssef");
        assertEquals(expectedName, student.getName());
    }

    @Test
    public void testStudentCode() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("123"));
    }

    @Test
    public void testStudentCode1() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("q1234567"));
    }

    @Test
    public void testStudentCode2() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("1234567-"));
    }

    @Test
    public void testStudentCode3() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        String expectedNumber = "1234567q";
        student.setNumber("1234567q");
        assertEquals(expectedNumber, student.getNumber());
    }
}

