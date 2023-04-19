package IO;

import Info.Student;
import Info.Subject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

/*  Output class creates one file for a subject and saves the students data to this file
*/
public class Output {
    private ArrayList<Student> data;
    private final File file;

    /*  constructor creates a file for the subject (if it doesn't already exist)
    *   @param subject
    */
    public Output(Subject subject) throws IOException{

        this.file = new File("../" + subject.getSubjectName() + ".CSV");

        //create the file
        if (!file.createNewFile()) throw new IOException("File already exists.");
        if (data == null) throw new NullPointerException("No entered data");
        FileWriter writer = new FileWriter(file);

        //write file header
        writer.write("Subject Name: " + subject.getSubjectName() + ",Max Mark: " + subject.getFullMark() + "\r\n");
        writer.write("Student name,Student number,GPA,Grade\r\n");

    }

    private void save() throws IOException, NullPointerException {

        if (data == null) throw new NullPointerException("No entered data");
        FileWriter writer = new FileWriter(file);

        //write content
        for (Student studentInfo : data) {
            writer.write(studentInfo.getName() + ",");
            writer.write(studentInfo.getNumber() + ",");
            writer.write(studentInfo.getGPA() + ",");
            writer.write(studentInfo.getGrade() + "\r\n");
        }
        writer.close();
    }

    /*save method saves the specified student data to the created subject file
    *   @param data lists of students' data to be saved in file
    */
    public void save(ArrayList<Student> data) throws IOException, NullPointerException {
        this.data = data;
        save();
    }
}
