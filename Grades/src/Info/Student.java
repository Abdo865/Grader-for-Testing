package Info;

import javax.naming.InvalidNameException;

import static Info.Utilities.*;

public class Student {
    private String name;
    private String number;
    private String grade;
    private float GPA;
    private int activities;
    private int oral;
    private int midterm;
    private int Final;


    public Student(String name, String number, int activities, int oral, int midterm, int Final) {
        setName(name);
        setNumber(number);
        setActivities(activities);
        setOral(oral);
        setMidterm(midterm);
        setFinal(Final);
        setGrade();
    }

    public void setGrade() {
        int total = getTotal();
        if (total >= 0 && total < 60) {
            grade = "F";
            GPA = 0;
        } else if (total >= 60 && total < 64) {
            grade = "D";
            GPA = 1;
        } else if (total >= 64 && total < 67) {
            grade = "D+";
            GPA = 1.3F;
        } else if (total >= 67 && total < 70) {
            grade = "C-";
            GPA = 1.7F;
        } else if (total >= 70 && total < 73) {
            grade = "C";
            GPA = 2;
        } else if (total >= 73 && total < 76) {
            grade = "C+";
            GPA = 2.3F;
        } else if (total >= 76 && total < 80) {
            grade = "B-";
            GPA = 2.7F;
        } else if (total >= 80 && total < 84) {
            grade = "B";
            GPA = 3;
        } else if (total >= 84 && total < 89) {
            grade = "B+";
            GPA = 3.3F;
        } else if (total >= 89 && total < 93) {
            grade = "A-";
            GPA = 3.7F;
        } else if (total >= 93 && total < 97) {
            grade = "A";
            GPA = 4;
        } else if (total >= 97 && total <= 100) {
            grade = "A+";
            GPA = 4;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name.charAt(0) == ' ') throw new InvalidNameException("Name must not start with space");
            else if (!isAlpha(name)) throw new InvalidNameException("Name must be all alphabets");
            this.name = name;
        } catch (InvalidNameException e) {
            System.out.println(e);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        try {
            if (number.length() != 8) throw new Exception("Number must be 8 characters");
            else if (!isNumeric(number.substring(0, 7))) throw new Exception("Number must start with 7 numbers");
            else if (!isAlphaNumeric(number.substring(7, 8)))
                throw new Exception("Number must end with either number or character");

            this.number = number;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getActivities() {
        return activities;
    }

    public void setActivities(int activities) {
        try {
            if (activities > 10 || activities < 0) throw new Exception("activities must be between 0 and 10");
            this.activities = activities;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getOral() {
        return oral;
    }

    public void setOral(int oral) {
        try {
            if (activities > 10 || activities < 0) throw new Exception("Oral must be between 0 and 10");
            this.oral = oral;
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public int getMidterm() {
        return midterm;
    }

    public void setMidterm(int midterm) {
        try {
            if (midterm > 20 || midterm < 0) throw new Exception("Midterm must be between 0 and 20");
            this.midterm = midterm;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getFinal() {
        return Final;
    }

    public void setFinal(int Final) {
        try {
            if (Final > 60 || Final < 0) throw new Exception("Final must be between 0 and 60");
            this.Final = Final;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getTotal() {
        return activities + midterm + oral + Final;
    }

    public float getGPA() {
        return GPA;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", grade='" + grade + '\'' +
                ", GPA=" + GPA +
                ", activities=" + activities +
                ", oral=" + oral +
                ", midterm=" + midterm +
                ", Final=" + Final +
                '}';
    }
}
