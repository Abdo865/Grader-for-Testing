package Testing.Utilities;

import Info.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StudentTest {

    /* ----------- Tests of the setActivities method using boundary values test ----------- */

    // boundary value test case (less than lower bound)
    @Test
    public void testSetActivities1() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setActivities(-1));
    }

    // boundary value test case (exactly lower bound value)
    @Test
    public void testSetActivities2() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setActivities(0));
    }

    // boundary value test case (normal value)
    @Test
    public void testSetActivities3() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setActivities(5));
    }

    // boundary value test case (exactly upper bound value)
    @Test
    public void testSetActivities4() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setActivities(10));
    }

    // boundary value test case (more than upper bound)
    @Test
    public void testSetActivities5() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setActivities(11));
    }
    /* --------------------------------------------------------------------------------- */


    /* ----------- Tests of the setMidterm method using boundary values test ----------- */

    // boundary value test case (less than lower bound)
    @Test
    public void testSetMidterm1() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setMidterm(-1));
    }

    // boundary value test case (exactly lower bound value)
    @Test
    public void testSetMidterm2() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setMidterm(0));
    }

    // boundary value test case (normal value)
    @Test
    public void testSetMidterm3() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setMidterm(10));
    }

    // boundary value test case (exactly upper value)
    @Test
    public void testSetMidterm4() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setMidterm(20));
    }

    // boundary value test case (more than upper bound)
    @Test
    public void testSetMidterm5() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setMidterm(21));
    }
    /* --------------------------------------------------------------------------------- */


    /* ----------- Tests of the setOral method using boundary values test ----------- */

    // boundary value test case (less than lower bound)
    @Test
    public void testSetOral1() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setOral(-1));
    }

    // boundary value test case (exactly lower bound value)
    @Test
    public void testSetOral2() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setOral(0));
    }

    // boundary value test case (normal value)
    @Test
    public void testSetOral3() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setOral(5));
    }

    // boundary value test case (exactly upper bound value)
    @Test
    public void testSetOral4() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setOral(10));
    }

    // boundary value test case (more than upper bound)
    @Test
    public void testSetOral5() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setOral(11));
    }
    /* --------------------------------------------------------------------------------- */


    /* ----------- Tests of the setFinal method using boundary values test ----------- */

    // boundary value test case (less than lower bound)
    @Test
    public void testSetFinal1() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setFinal(-1));
    }

    // boundary value test case (exactly lower bound value)
    @Test
    public void testSetFinal2() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setFinal(0));
    }

    // boundary value test case (normal value)
    @Test
    public void testSetFinal3() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setFinal(30));
    }

    // boundary value test case (exactly upper bound value)
    @Test
    public void testSetFinal4() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertDoesNotThrow(() -> student.setFinal(60));
    }

    // boundary value test case (more than upper bound)
    @Test
    public void testSetFinal5() throws Exception {
        Student student = new Student("John", "12345678", 5, 3, 4, 5);
        Assertions.assertThrows(Exception.class, () -> student.setFinal(61));
    }
    /* --------------------------------------------------------------------------------- */
}
