package IO;

import Info.Student;
import Info.Subject;

import javax.naming.InvalidNameException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    private static Scanner reader;

    public static Subject getSubjectInfo(String fileName) throws Exception {
        Subject subject;
        reader = new Scanner(new File(fileName));

        String[] values = reader.nextLine().split(",");
        subject = new Subject(values[0].trim(), values[1].trim(), Integer.parseInt(values[2].trim()));
        return subject;
    }

    public static ArrayList getStudentList(String fileName) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
            //to skip the first line
            reader = new Scanner(new File(fileName));
            reader.nextLine();

            //to store the students into the array list.
            while (reader.hasNext()) {
                String[] values = reader.nextLine().split(", ");
                Student nextStudent = new Student(values[0].trim(), values[1].trim(), Integer.parseInt(values[2].trim()), Integer.parseInt(values[3].trim()), Integer.parseInt(values[4].trim()), Integer.parseInt(values[5].trim()));
                students.add(nextStudent);
            }

        return students;

    }
}