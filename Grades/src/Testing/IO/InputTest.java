package Testing.IO;

import IO.Input;
import Info.Student;
import Info.Subject;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import javax.naming.InvalidNameException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InputTest {

    @Test
    public void testStudentName() throws Exception{
        Assertions.assertThrows(InvalidNameException.class, ()-> Input.getStudentList("./InputTests/testName.txt"));
    }

    @Test
    public void testStudentCode() throws Exception{
        Assertions.assertThrows(Exception.class, ()-> Input.getStudentList("./InputTests/testCode.txt"));
    }
    @Test
    public void testStudentActivities() throws Exception{
        Assertions.assertThrows(Exception.class, ()-> Input.getStudentList("./InputTests/testName.txt"));
    }

    @Test
    public void testStudentOral() throws Exception{
        Assertions.assertThrows(Exception.class, ()-> Input.getStudentList("./InputTests/testName.txt"));
    }

    @Test
    public void testStudentMidterm() throws Exception{
        Assertions.assertThrows(Exception.class, ()-> Input.getStudentList("./InputTests/testName.txt"));
    }

    @Test
    public void testStudentFinal() throws Exception{
        Assertions.assertThrows(Exception.class, ()-> Input.getStudentList("./InputTests/testName.txt"));
    }
    @Test
    public void testWorkingFile() throws Exception{
        Assertions.assertDoesNotThrow(()-> Input.getStudentList("./InputTests/testAllWorking.txt"));
    }
}