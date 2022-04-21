package Student;

/** @author Mégane Kickouama @2176328 */

public class Student {

    private static int nextID = 0;
    private String ID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Course course1;
    private Course course2;

    public Student() {

        nextID++;
        ID = "000" + nextID;
        firstName = "";
        lastName = "";
        email = "";
        age = 0;
        course1 = new Course(); // only 1 course? or both courses?
        course2 = new Course();
    }

    public Student(String setFirstName, String setLastName) {

        nextID++;
        ID = "000" + nextID;
        firstName = setFirstName;
        lastName = setLastName;
        email = "";
        age = 0;
    }

    public Student(String setFirstName, String setLastName, String setEmail, 
    int setAge, Course setCourse1, Course setCourse2) {

        nextID ++;
        ID = "000" + nextID;
        firstName = setFirstName;
        lastName = setLastName;
        email = setEmail;
        age = setAge;
        course1 = setCourse1;
        course2 = setCourse2;
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

    /** Setters */
}