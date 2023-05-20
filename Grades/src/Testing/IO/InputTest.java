package Testing.IO;

import IO.Input;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.InvalidNameException;

public class InputTest {

    // Testing for the Input class to ensure that the input file is read correctly and that the names are stored correctly
    @Test
    public void testStudentName() {
        Assertions.assertThrows(InvalidNameException.class, () -> Input.getStudentList("./InputTests/testName.txt"));
    }

    // Testing for the Input class to ensure that the input file is read correctly and that the codes are stored correctly
    @Test
    public void testStudentCode() {
        Assertions.assertThrows(Exception.class, () -> Input.getStudentList("./InputTests/testCode.txt"));
    }

    // Testing for the Input class to ensure that the input file is read correctly and that the activities are stored correctly
    // with valid activities grades
    @Test
    public void testStudentActivities() {
        Assertions.assertThrows(Exception.class, () -> Input.getStudentList("./InputTests/testActivities.txt"));
    }

    // Testing for the Input class to ensure that the input file is read correctly and that the oral grades are stored correctly
    // with valid oral grades
    @Test
    public void testStudentOral() {
        Assertions.assertThrows(Exception.class, () -> Input.getStudentList("./InputTests/testOral.txt"));
    }

    // Testing for the Input class to ensure that the input file is read correctly and that the midterm grades are stored correctly
    // with valid midterm grades
    @Test
    public void testStudentMidterm() {
        Assertions.assertThrows(Exception.class, () -> Input.getStudentList("./InputTests/testMidterm.txt"));
    }

    // Testing for the Input class to ensure that the input file is read correctly and that the final grades are stored correctly
    // with valid final grades
    @Test
    public void testStudentFinal() {
        Assertions.assertThrows(Exception.class, () -> Input.getStudentList("./InputTests/testFinal.txt"));
    }

    // Testing for the Input class to ensure that the input file is read correctly and all data are correct
    @Test
    public void testWorkingFile() {
        Assertions.assertDoesNotThrow(() -> Input.getStudentList("./InputTests/testAllWorking.txt"));
    }
}
