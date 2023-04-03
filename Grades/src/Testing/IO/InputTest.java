package Testing.IO;

import IO.Input;
import Info.Student;
import Info.Subject;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InputTest {

    @Test
    public void getSubjectInfo() throws Exception {
        Subject ExpectedSubject = new Subject("Database Systems", "CSE323s", 100);
        Subject ActualSubject = Input.getSubjectInfo("./Test.txt");
        assertEquals(ExpectedSubject.getSubjectCode(), ActualSubject.getSubjectCode());
        assertEquals(ExpectedSubject.getSubjectName(), ActualSubject.getSubjectName());
        assertEquals(ExpectedSubject.getFullMark(), ExpectedSubject.getFullMark());
    }

    @Test
    public void getStudentList() throws Exception {
        Student a = new Student("Yusuf Ashraf", "19000813", -5, -10, 0, 0);
        Student b = new Student("Abdo Nasser", "194547", -5, -10, 0, 0);
        Student c = new Student("Rana Gamal", "1901398", -5, -10, 0, 0);
        Student d = new Student("Sara Ahmed", "1901247", -5, -10, 0, 0);
        ArrayList<Student> ExpectedStudents = new ArrayList<Student>();
        ExpectedStudents.add(a);
        ExpectedStudents.add(b);
        ExpectedStudents.add(c);
        ExpectedStudents.add(d);

        ArrayList<Student> ActualStudents = Input.getStudentList("./Test.txt");

        for (int i = 0; i < ActualStudents.size(); i++) {
            assertEquals(ExpectedStudents.get(i).getName(), ActualStudents.get(i).getName());
            assertEquals(ExpectedStudents.get(i).getNumber(), ActualStudents.get(i).getNumber());
            assertEquals(ExpectedStudents.get(i).getActivities(), ActualStudents.get(i).getActivities());
            assertEquals(ExpectedStudents.get(i).getMidterm(), ActualStudents.get(i).getMidterm());
            assertEquals(ExpectedStudents.get(i).getOral(), ActualStudents.get(i).getOral());
            assertEquals(ExpectedStudents.get(i).getFinal(), ActualStudents.get(i).getFinal());
        }

    }
}