import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParseInputTest {

    @Test
    public void getSubjectInfo() {
        Subject ExpectedSubject = new Subject("Database Systems", "CSE333s", 100);
        Subject ActualSubject = ParseInput.getSubjectInfo("database.txt");
        assertEquals(ExpectedSubject.getSubjectCode(), ActualSubject.getSubjectCode());
        assertEquals(ExpectedSubject.getSubjectName(), ActualSubject.getSubjectName());
        assertEquals(ExpectedSubject.getFullMark(), ExpectedSubject.getFullMark());
    }

    @Test
    public void getStudentList() {
        Student a = new Student("Yusuf Ashraf", "18q6813", -5, -10, 0, 0);
        Student b = new Student("Abdo Nasser", "194547", -5, -10, 0, 0);
        Student c = new Student("Rana Gamal", "1901398", -5, -10, 0, 0);
        Student d = new Student("Sara Ahmed", "1901247", -5, -10, 0, 0);
        ArrayList<Student> ExpectedStudents = new ArrayList<Student> ();
        ExpectedStudents.add(a);
        ExpectedStudents.add(b);
        ExpectedStudents.add(c);
        ExpectedStudents.add(d);

        ArrayList<Student> ActualStudents = ParseInput.getStudentList("database.txt");

        for(int i = 0; i < ActualStudents.size(); i++){
            assertEquals(ExpectedStudents.get(i).getName(), ActualStudents.get(i).getName());
            assertEquals(ExpectedStudents.get(i).getNumber(), ActualStudents.get(i).getNumber());
            assertEquals(ExpectedStudents.get(i).getActivities(), ActualStudents.get(i).getActivities());
            assertEquals(ExpectedStudents.get(i).getMidterm(), ActualStudents.get(i).getMidterm());
            assertEquals(ExpectedStudents.get(i).getOral(), ActualStudents.get(i).getOral());
            assertEquals(ExpectedStudents.get(i).getFinal(), ActualStudents.get(i).getFinal());
        }


    }
}