import IO.Output;
import Info.Student;
import Info.Subject;

import java.util.ArrayList;

import static IO.Input.getStudentList;
import static IO.Input.getSubjectInfo;


public class Main {
    public static void main(String[] args) throws Exception {
        Subject subject = getSubjectInfo("./testAllWorking.txt");
        ArrayList<Student> students = getStudentList("./testAllWorking.txt");
        Output o = new Output(subject);
        o.save(students);
    }
}