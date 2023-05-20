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

public class OutputTest {
    private String subjectName = "Test";
    private String subjectCode = "TET123";

    private void clear() throws Exception {
        File file = new File("../Test.CSV");
        Files.deleteIfExists(file.toPath());
    }

    @Test
    public void testFileAlreadyExists() {
        Assertions.assertDoesNotThrow(() -> {
            clear();

            Subject subject = new Subject(subjectName, subjectCode);

            new Output(subject);

            assertThrows(IOException.class, () -> new Output(subject));
        });
    }

    @Test
    public void testSubjectIsNull() {
        Assertions.assertDoesNotThrow(() -> {
            clear();
        });

        assertThrows(NullPointerException.class, ()->new Output(null));
    }

    @Test
    public void testDataIsNull() {
        Assertions.assertDoesNotThrow(() -> {
            clear();
    
            Subject subject = new Subject(subjectName, subjectCode);
    
            Output outputFile = new Output(subject);
    
            assertThrows(NullPointerException.class, () -> outputFile.save(null));
        });
    }

    @Test
    public void testOutputFormat() {
        Assertions.assertDoesNotThrow(() -> {
            clear();

            Subject subject = new Subject(subjectName, subjectCode);

            Output outputFile = new Output(subject);

            ArrayList<Student> data = new ArrayList<>();
            data.add(new Student("youssef", "12345678", 2, 9, 15, 40));
            data.add(new Student("fsddf", "12345678", 9, 9, 15, 40));
            data.add(new Student("youssdfecsef", "12345678", 10, 9, 9, 40));
            data.add(new Student("youcdewrssef", "12345678", 8, 10, 15, 40));
            data.add(new Student("wedewc", "12345678", 9, 9, 15, 40));
            data.add(new Student("youcewfrefgvcssef", "12345678", 1, 9, 12, 20));

            outputFile.save(data);

            // Testing format of the output
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
