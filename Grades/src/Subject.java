public class Subject {
    private String subjectName;
    private String subjectCode;
    private int fullMark;

    //cons
    Subject(String subjectName, String subjectCode, int fullMark){
        setSubjectName(subjectName);
        setSubjectCode(subjectCode);
        setFullMark(fullMark);
    }
    //default Full Mark = 100
    Subject(String SubjectName, String SubjectCode){
        setSubjectName(subjectName);
        setSubjectCode(subjectCode);
        setFullMark(100);
    }

    //setters
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
    public void setSubjectCode(String subjectCode){
        this.subjectCode = subjectCode;
    }
    public void setFullMark(int fullMark){
        this.fullMark = fullMark;
    }

    //getters
    public String getSubjectName(){
        return this.subjectName;
    }
    public String getSubjectCode(){
        return this.subjectCode;
    }
    public int getFullMark(){
        return this.fullMark;
    }
}

