package Testing.Utilities;

import Info.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.InvalidNameException;

import static org.junit.Assert.assertEquals;

public class PathCoverageTest {

    /* ---------------- Path Coverage Test ---------------- */
    
    // Test for the setName method space at the beginning of the name
    // path(1, 2, 3, 9)
    @Test
    public void testNameWithSpaceAtStart() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(InvalidNameException.class, () -> student.setName(" John"));
    }

    // Test for the setName method with invalid name that has numbers on it
    //path(1, 2, 4, 5, 9)
    @Test
    public void testNameWithNonAlphabeticCharacters() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(InvalidNameException.class, () -> student.setName("John123"));
    }

    // Test valid name
    //path(1, 2, 4, 6, 8, 9)
    @Test
    public void testValidName() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        String expectedName = "youssef";
        student.setName("youssef");
        assertEquals(expectedName, student.getName());
    }

    // Test for the setNumber method with number length less than 8 digits
    //path((1, 2, 3, 9)
    @Test
    public void testNumberLengthIncorrect() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("123"));
    }

    // Test for the Number with non-numeric character at the beginning
    //path(1, 2, 4, 5, 9)
    @Test
    public void testNumberStartsWithNonNumeric() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("q1234567"));
    }

    // Test for the Number with non-alphanumeric character at the end
    //path(1, 2, 4, 6, 7, 9)
    @Test
    public void testNumberEndsWithNonAlphaNumeric() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setNumber("1234567-"));
    }


    // Test Number with valid case
    //path (1, 2, 4, 6, 8, 9)
    @Test
    public void testValidNumber() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        String expectedNumber = "1234567q";
        student.setNumber("1234567q");
        assertEquals(expectedNumber, student.getNumber());
    }
}

