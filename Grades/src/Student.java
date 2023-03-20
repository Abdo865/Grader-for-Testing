public class Student {
    private String name;
    private String number;
    private int activities;
    private int oral;
    private int midterm;
    private int Final;
    private int total;

    //cons
    Student(String name, String number, int activities, int oral, int midterm, int Final){
        setName(name);
        setNumber(number);
        setActivities(activities);
        setOral(oral);
        setMidterm(midterm);
        setFinal(Final);
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setActivities(int activities){
        this.activities = activities;
    }
    public void setFinal(int Final){
        this.Final = Final;
    }
    public void setMidterm(int midterm){

        this.midterm = midterm;
    }
    public void setOral(int oral){
        this.oral = oral;
    }

    //geterrs
    //(1)total marks of the student
    //(2) student name
    //(3) student number.
    public int getTotal(){
        return this.Final + this.activities + this.midterm + this.oral;
    }
    public String getName(){
        return this.name;
    }
    public String getNumber(){
        return this.number;
    }

}
