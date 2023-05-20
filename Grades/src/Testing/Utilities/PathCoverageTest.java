package Testing.Utilities;

import Info.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.InvalidNameException;

import static org.junit.Assert.assertEquals;

public class PathCoverageTest {

    @Test
    public void testNameWithSpaceAtStart() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(InvalidNameException.class, () -> student.setName(" John"));
    }

    @Test
    public void testNameWithNonAlphabeticCharacters() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(InvalidNameException.class, () -> student.setName("John123"));

    }

    @Test
    public void testValidName() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        String expectedName = "youssef";
        student.setName("youssef");
        assertEquals(expectedName, student.getName());
    }

    @Test
    public void testNumberLengthIncorrect() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("123"));
    }

    @Test
    public void testNumberStartsWithNonNumeric() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("q1234567"));
    }

    @Test
    public void testNumberEndsWithNonAlphaNumeric() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("1234567-"));
    }

    @Test
    public void testValidNumber() throws Exception{
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        String expectedNumber = "1234567q";
        student.setNumber("1234567q");
        assertEquals(expectedNumber, student.getNumber());
    }
}

