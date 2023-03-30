package IO;

import Info.Student;
import Info.Subject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Output {
    private ArrayList<Student> data;
    private Subject subject;

    public Output(Subject subject) {
        File file = new File("../"+subject.getSubjectName() + ".CSV");
        //create the file
        try {
            this.subject = subject;
            if (!file.createNewFile()) throw new IOException("File already exists.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void setData(ArrayList<Student> data) {
        this.data = data;
    }

    public void save() {
        try {
            if (subject == null) throw new NullPointerException("File not created");
            else if (data == null) throw new NullPointerException("No entered data");

            //write content
            FileWriter writer = new FileWriter("../"+subject.getSubjectName() + ".CSV");
            writer.write("Subject Name: " + subject.getSubjectName() + ",Max Mark: " + subject.getFullMark() + "\r\n");
            writer.write("Student name,Student number,GPA,Grade\r\n");
            for (Student studentInfo : data) {
                writer.write(studentInfo.getName() + ",");
                writer.write(studentInfo.getNumber() + ",");
                writer.write(studentInfo.getGPA() + ",");
                writer.write(studentInfo.getGrade() + "\r\n");
            }

            writer.close();
        } catch (NullPointerException | IOException e) {
            System.out.println(e);
        }
    }
}