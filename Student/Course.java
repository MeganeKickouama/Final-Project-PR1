package Student;

public class Course {

    /** Data members */
    
    private String courseName;
    private int credit;
    private boolean isComplementaryCourse;

    public Course() {

        courseName = "";
        credit = 0;
        isComplementaryCourse = false;
    }

    public Course(String setCourseName) {

        courseName = setCourseName;
        credit = 0;
        isComplementaryCourse = false;
    }

    public Course(String setCourseName, int setCredit, boolean setIsComplementary) {

        courseName = setCourseName;
        credit = setCredit;
        isComplementaryCourse = setIsComplementary;
    }

    //copy constructor

    public String toString(Course course) {

        String yesNo;

        if (this.isComplementaryCourse) {
            yesNo = "yes";
        } else yesNo = "no";

        return "Course Name  : " + this.courseName + "\n" +
               "Credit       : " + this.credit + "\n" +
               "Complementary: " + yesNo;
    }

    public boolean equals(Course otherCourse) {

        return (otherCourse.courseName == this.courseName &&
        otherCourse.credit == this.credit && 
        otherCourse.isComplementaryCourse == this.isComplementaryCourse);
    }

    /** Getters */

    public String getCourseName() {

        return this.courseName;
    }

    public int getCredit() {

        return this.credit;
    }

    public boolean getIsComplementary() {

        return this.isComplementaryCourse;
    }

    /** Setters */

    public void setCourseName(String newCourseName) {

        this.courseName = newCourseName;
    }

    public void setCredit(int newCredit) {

        this.credit = newCredit;
    }

    public void getIsComplementary(boolean newIsComplementary) {

        this.isComplementaryCourse = newIsComplementary;
    }
}
