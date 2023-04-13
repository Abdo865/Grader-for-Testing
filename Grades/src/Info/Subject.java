package Info;

import javax.naming.InvalidNameException;

import static Info.Utilities.isAlpha;
import static Info.Utilities.isNumeric;

public class Subject {
    private String subjectName;
    private String subjectCode;
    private int fullMark;

    //cons
    public Subject(String subjectName, String subjectCode, int fullMark) throws Exception {
        setSubjectName(subjectName);
        setSubjectCode(subjectCode);
        setFullMark(fullMark);
    }


    //default Full Mark = 100
    public Subject(String subjectName, String subjectCode) throws Exception {
        setSubjectName(subjectName);
        setSubjectCode(subjectCode);
        setFullMark(100);
    }

    //getters
    public String getSubjectName() {
        return this.subjectName;
    }

    //setters
    public void setSubjectName(String subjectName) throws InvalidNameException {
        if (subjectName.charAt(0) == ' ') throw new InvalidNameException("Subject Name must not start with space");
        else if (!isAlpha(subjectName))
            throw new InvalidNameException("Subject Name must be all alphabets with spaces inside if needed");
        this.subjectName = subjectName;

    }

    public String getSubjectCode() {
        return this.subjectCode;
    }

    public void setSubjectCode(String subjecCode) throws Exception {
        if (subjecCode.length() > 7 || subjecCode.length() < 6)
            throw new Exception("Subject code length must be 6 or 7");
        else if (!isAlpha(subjecCode.substring(0, 3)) || !isNumeric(subjecCode.substring(3, 6)))
            throw new Exception("Subject code must start with 3 letters then 3 numbers");
        else if (subjecCode.length() == 7 && subjecCode.charAt(6) != 's')
            throw new Exception("Subject code must end with s since it's 7 characters");

        this.subjectCode = subjecCode;
    }

    public int getFullMark() {
        return this.fullMark;
    }

    public void setFullMark(int fullMark) {
        this.fullMark = fullMark;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectName='" + subjectName + '\'' + ", subjectCode='" + subjectCode + '\'' + ", fullMark=" + fullMark + '}';
    }

}

