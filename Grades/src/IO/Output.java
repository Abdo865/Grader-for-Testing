package IO;

import Info.Student;
import Info.Subject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class Output {
    private ArrayList<Student> data;
    private Subject subject;
    private File file;

    public Output(Subject subject) throws IOException{

        this.file = new File("../" + subject.getSubjectName() + ".CSV");
        //create the file

        this.subject = subject;
        if (!file.createNewFile()) throw new IOException("File already exists.");

    }

    public void save() throws IOException, NullPointerException {

        if (data == null) throw new NullPointerException("No entered data");
        FileWriter writer = new FileWriter(file);
        //write content

        writer.write("Subject Name: " + subject.getSubjectName() + ",Max Mark: " + subject.getFullMark() + "\r\n");
        writer.write("Student name,Student number,GPA,Grade\r\n");
        for (Student studentInfo : data) {
            writer.write(studentInfo.getName() + ",");
            writer.write(studentInfo.getNumber() + ",");
            writer.write(studentInfo.getGPA() + ",");
            writer.write(studentInfo.getGrade() + "\r\n");
        }
        writer.close();
    }

    public void save(ArrayList<Student> data) throws IOException, NullPointerException {
        this.data = data;
        save();
    }
}