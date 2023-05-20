package Testing.Utilities;

import Info.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {
    @Test
    public void testSetGrade1() throws Exception {
        // Total score less than 0
        Student student1 = new Student("John", "12345678", -5, 6, 7, -10);
        assertEquals(-2, student1.getTotal()); //invalid
        assertEquals("F", student1.getGrade());
        assertEquals(0, student1.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade2() throws Exception {
        // Total score between 0 and 60
        Student student2 = new Student("Jane", "23456789", 4, 8, 15, 30);
        assertEquals(57, student2.getTotal());
        assertEquals("F", student2.getGrade());
        assertEquals(0, student2.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade3() throws Exception {
        // Total score between 60 and 64
        Student student3 = new Student("Bob", "34567890", 3, 7, 20, 33);
        assertEquals(63, student3.getTotal());
        assertEquals("D", student3.getGrade());
        assertEquals(1, student3.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade4() throws Exception {
        // Total score between 64 and 67
        Student student4 = new Student("Alice", "45678901", 6, 9, 20, 30);
        assertEquals(65, student4.getTotal());
        assertEquals("D+", student4.getGrade());
        assertEquals(1.3, student4.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade5() throws Exception {
        // Total score between 67 and 70
        Student student5 = new Student("Tom", "56789012", 7, 8, 18, 36);
        assertEquals(69, student5.getTotal());
        assertEquals("C-", student5.getGrade());
        assertEquals(1.7, student5.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade6() throws Exception {
        // Total score between 70 and 73
        Student student6 = new Student("Mary", "67890123", 8, 6, 5, 52);
        assertEquals(71, student6.getTotal());
        assertEquals("C", student6.getGrade());
        assertEquals(2, student6.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade7() throws Exception {
        // Total score between 73 and 76
        Student student7 = new Student("Jim", "78901234", 9, 5, 7, 54);
        assertEquals(75, student7.getTotal());
        assertEquals("C+", student7.getGrade());
        assertEquals(2.3, student7.getGPA(), 0.01);

    }

    @Test
    public void testSetGrade8() throws Exception {
        // Total score between 76 and 80
        Student student8 = new Student("Sara", "89012345", 10, 4, 19, 45);
        assertEquals(78, student8.getTotal());
        assertEquals("B-", student8.getGrade());
        assertEquals(2.7, student8.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade9() throws Exception {
        // Total score between 80 and 84
        Student student9 = new Student("David", "90123456", 5, 7, 20, 50);
        assertEquals(82, student9.getTotal());
        assertEquals("B", student9.getGrade());
        assertEquals(3, student9.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade10() throws Exception {
        // Total score between 84 and 89
        Student student10 = new Student("Lisa", "01234567", 6, 8, 20, 52);
        assertEquals(86, student10.getTotal());
        assertEquals("B+", student10.getGrade());
        assertEquals(3.3, student10.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade11() throws Exception {
        // Total score between 89 and 93
        Student student11 = new Student("Mike", "12345678", 7, 9, 20, 55);
        assertEquals(91, student11.getTotal());
        assertEquals("A-", student11.getGrade());
        assertEquals(3.7, student11.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade12() throws Exception {
        // Total score between 93 and 97
        Student student12 = new Student("Anna", "23456789", 8, 10, 20, 58);
        assertEquals(96, student12.getTotal());
        assertEquals("A", student12.getGrade());
        assertEquals(4, student12.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade13() throws Exception {
        // Total score between 97 and 100
        Student student13 = new Student("Peter", "34567890", 9, 9, 20, 60);
        assertEquals(98, student13.getTotal());
        assertEquals("A+", student13.getGrade());
        assertEquals(4, student13.getGPA(), 0.01);
    }

    @Test
    public void testSetGrade14() throws Exception {
        // Total score greater than 100
        Student student14 = new Student("Jack", "45678901", 10, 10, 25, 60);
        assertEquals(105, student14.getTotal()); //invalid
        assertEquals("A+", student14.getGrade());
        assertEquals(4, student14.getGPA(), 0.01);
    }

}