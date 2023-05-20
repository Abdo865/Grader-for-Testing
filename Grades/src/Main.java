import IO.Output;
import Info.Student;
import Info.Subject;

import java.util.ArrayList;

import static IO.Input.getSubjectInfo;
import static IO.Input.getStudentList;


public class Main {
    public static void main(String[] args) throws Exception {
        Subject subject = getSubjectInfo("./Test.txt");
        ArrayList<Student> students = getStudentList("./Test.txt");
        Output o = new Output(subject);
        o.save(students);
    }
}