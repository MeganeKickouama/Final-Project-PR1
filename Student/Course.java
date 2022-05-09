package Student;

/** @author Mégane Kickouama 2176328 */

public class Course {

    /** Data members */
    private String courseName;
    private int credit;
    private boolean isComplementaryCourse;

    /** Default constructor */
    public Course() {

        courseName = "";
        credit = 0;
        isComplementaryCourse = false;
    }

    /** Overloaded constructor with courseName */
    public Course(String setCourseName) {

        courseName = setCourseName;
        credit = 0;
        isComplementaryCourse = false;
    }

    /** Overloaded constructor with courseName, credit and isComplementary */
    public Course(String setCourseName, int setCredit, boolean setIsComplementary) {

        courseName = setCourseName;
        credit = setCredit;
        isComplementaryCourse = setIsComplementary;
    }

    /** Copy contsructor, gets data fields of other course, and copies them */
    public Course(Course otherCourse) {

        courseName = otherCourse.courseName;
        credit = otherCourse.credit;
        isComplementaryCourse = otherCourse.isComplementaryCourse;
    }

    /** String format for the course */
    @Override
    public String toString() {

        String yesNo;

        if (isComplementaryCourse) {
            yesNo = "Yes";
        } else
            yesNo = "No";

        return "Course Name  : " + courseName + "\n" +
                "Credit       : " + credit + "\n" +
                "Complementary: " + yesNo;
    }

    public boolean equals(Course otherCourse) {

        return (this.courseName == otherCourse.courseName &&
                this.credit == otherCourse.credit &&
                this.isComplementaryCourse == otherCourse.isComplementaryCourse);
    }

    /** Getters */
    public String getCourseName() {

        return courseName;
    }

    public int getCredit() {

        return credit;
    }

    public boolean getIsComplementary() {

        return isComplementaryCourse;
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
