package Student;

/** @author Mégane Kickouama @2176328 */

public class Student {

    /** Data members */
    private static int nextID = 0;
    private String ID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Course course1;
    private Course course2;

    /** Default constructor */
    public Student() {

        nextID++;
        ID = convertIntoID(nextID);
        firstName = "";
        lastName = "";
        email = "";
        age = 0;
        course1 = new Course(); // only 1 course? or both courses?
        course2 = new Course();
    }

    public Student(String setFirstName, String setLastName) {

        nextID++;
        ID = convertIntoID(nextID);
        firstName = setFirstName;
        lastName = setLastName;
        email = "";
        age = 0;
    }

    public Student(String setFirstName, String setLastName, String setEmail, 
    int setAge, Course setCourse1, Course setCourse2) {

        nextID ++;
        ID = convertIntoID(nextID);
        firstName = setFirstName;
        lastName = setLastName;
        email = setEmail;
        age = setAge;
        course1 = setCourse1;
        course2 = setCourse2;
    }

    // this method is not for outside use, just to make code cleaner 
    public static String convertIntoID(int nextID) {

        if (999 < nextID && nextID < 10000) { // if it is a 4 digit number, add nothing
            
            return String.valueOf(nextID);

        } else if (99 < nextID && nextID < 1000) { // if it is a 3-digit number, add 1 zero

            return "0" + String.valueOf(nextID);

        } else if (9 < nextID && nextID < 100) { // if it is a 2-digit number, add 2 zeros

            return "00" + String.valueOf(nextID);

        } else if (0 < nextID && nextID < 10) { // if it is a 1-digit number, add three zeros

            return "000" + String.valueOf(nextID);

        } else { 

            return "0000";
        }
    }

    // copy constructor
    // extract email account method

    public boolean isEmailValid(String email) {

        boolean doesHaveAt = false; // does it have '@'?
        boolean doesHaveDot = false; // does it have '.'?

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                doesHaveAt = true;
            } else if (email.charAt(i) == '.') {
                doesHaveDot = true;
            } else {}
        }

        if (email.charAt(0) == '@') {
            doesHaveAt = false;
        } else if (email.charAt(email.length() - 1)  == '.') {
            doesHaveDot = false;
        }

        return (doesHaveAt && doesHaveDot);
    }

    public String toString() {

        return "Name: " + firstName + " " + lastName + "\n" +
               "ID: " + ID + "\n" +
               "Age: " + age + "\n" +
               "Email: " + email + "\n" +
               "Course1: " + course1.getCourseName() + "[" + course1.getCredit() + " credits]" + "\n" +
               "Course1: " + course1.getCourseName() + "[" + course2.getCredit() + " credits]";
    }

    public boolean equals(Student otherStudent) {

        return (this.lastName == otherStudent.lastName && this.firstName == otherStudent.firstName
        && this.ID == otherStudent.ID && this.age == otherStudent.age && this.email == otherStudent.email &&
        this.course1 == otherStudent.course1 && this.course2 == otherStudent.course2);
    }

    /** Getters */

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public String getEmail() {

        return this.email;
    }

    public String getID() {

        return this.ID;
    }

    public int getAge() {

        return this.age;
    }

    public Course getCourse1() {

        return this.course1;
    }

    public Course getCourse2() {

        return this.course2;
    }

    /** Setters */

    public void setFirstName(String newFirstName) {

        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {

        this.lastName = newLastName;
    }

    public void setEmail(String newEmail) {

        this.email = newEmail;
    }

    // set ID ?

    public void getAge(int newAge) {

        this.age = newAge;
    }

    public void setCourse1(Course newCourse1) {

        this.course1 = newCourse1;
    }

    public void setCourse2(Course newCourse2) {

        this.course2 = newCourse2;
    }
}