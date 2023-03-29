package Testing.IO;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import javax.naming.InvalidNameException;

import java.io.BufferedReader;

import org.junit.Assert;
import org.junit.Test;
import Info.*;
import IO.*;

// C:\Users\saifs\AppData\Roaming\Code\User\workspaceStorage\4fa5863cf875296129928d937c1f612a\redhat.java\jdt_ws

public class OutputTest {

    @Test
    public void testFileAlreadyExists() {
        File file = new File("../Test.CSV");
        Assertions.assertDoesNotThrow(()->Files.deleteIfExists(file.toPath()));

        String subjectName = "Test";
        String subjectCode = "TEST123";

        Subject subject = new Subject(subjectName, subjectCode);

        new Output(subject);

        assertThrows(IOException.class, () -> new Output(subject));
    }

    @Test
    public void testSubjectIsNull() {
        File file = new File("../Test.CSV");
        Assertions.assertDoesNotThrow(()->Files.deleteIfExists(file.toPath()));
        
        assertThrows(NullPointerException.class, ()->new Output(null));
    }

    @Test
    public void testDataIsNull() {
        File file = new File("../Test.CSV");
        Assertions.assertDoesNotThrow(()->Files.deleteIfExists(file.toPath()));

        String subjectName = "Test";
        String subjectCode = "TEST123";

        Subject subject = new Subject(subjectName, subjectCode);

        Output outputFile = new Output(subject);

        assertThrows(NullPointerException.class, () -> outputFile.save());
    }

    @Test
    public void testOutputFormat() {
        File file = new File("../Test.CSV");
        Assertions.assertDoesNotThrow(()->Files.deleteIfExists(file.toPath()));

        String subjectName = "Test";
        String subjectCode = "TEST123";

        Subject subject = new Subject(subjectName, subjectCode);

        Output outputFile = new Output(subject);

        ArrayList<Student> data = new ArrayList<Student>();
        data.add(new Student("youssef", "17", 9, 9, 15, 40));
        data.add(new Student("youssef", "17", 9, 9, 15, 40));
        data.add(new Student("youssef", "17", 9, 9, 15, 40));
        data.add(new Student("youssef", "17", 9, 9, 15, 40));
        data.add(new Student("youssef", "17", 9, 9, 15, 40));
        data.add(new Student("youssef", "17", 9, 9, 15, 40));
        
        outputFile.setData(data);

        outputFile.save();

        // Testing format of the output
        Assertions.assertDoesNotThrow(() -> {
            FileReader fileReader = new FileReader("../Test.CSV");
            BufferedReader reader = new BufferedReader(fileReader);
			String line = reader.readLine();

            System.out.println(line);

            assertEquals("Subject Name: Test,Max Mark: 100", line);

            line = reader.readLine();

            assertEquals("Student name,Student number,GPA,Grade", line);

            int index = 0;

			while (line != null && index < data.size()) {
				line = reader.readLine();
                assertEquals(data.get(index).getName()+","+data.get(index).getNumber()+
                            ","+data.get(index).getGPA()+","+data.get(index).getGrade(), line);
                index++;
			}

			reader.close();
        });
    }
}
