import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParseInput {

    private static Scanner reader;


    public static Subject getSubjectInfo(String fileName){
        Subject subject = null;
        try{
            reader = new Scanner(new File(fileName));

            //string array to save the (first) line values
            String[] values = reader.nextLine().split(",");
            subject = new Subject(values[0].trim(), values[1].trim(), Integer.parseInt(values[2].trim()));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return subject;
    }
    public static ArrayList getStudentList(String fileName){
        ArrayList<Student> students = new ArrayList<Student>();
        try{
            //to skip the first line
            reader = new Scanner(new File(fileName));
            reader.nextLine();

            //to store the students into the array list.
            while (reader.hasNext()){
                String[] values = reader.nextLine().split(", ");
                Student nextStudent = new Student(values[0].trim(), values[1].trim(), Integer.parseInt(values[2].trim()) ,
                        Integer.parseInt(values[3].trim()), Integer.parseInt(values[4].trim()), Integer.parseInt(values[5].trim()));
                students.add(nextStudent);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return students;

    }
}
