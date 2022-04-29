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
        ID = generateID(nextID);
        firstName = "";
        lastName = "";
        email = "";
        age = 0;
        course1 = new Course();
        course2 = new Course();
    }

    /** Overloaded constructor with set first name and last name */
    public Student(String setFirstName, String setLastName) {

        nextID++;
        ID = generateID(nextID);
        firstName = setFirstName;
        lastName = setLastName;
        email = "";
        age = 0;
    }

    /** Overloaded constructor with all parameters */
    public Student(String setFirstName, String setLastName, String setEmail,
            int setAge, Course setCourse1, Course setCourse2) {

        nextID++;
        ID = generateID(nextID);
        firstName = setFirstName;
        lastName = setLastName;
        email = setEmail;
        age = setAge;
        course1 = setCourse1;
        course2 = setCourse2;
    }

    public Student(Student otherStudent) {

        nextID++;
        ID = generateID(nextID);
        firstName = otherStudent.firstName;
        lastName = otherStudent.lastName;
        email = otherStudent.email;
        age = otherStudent.age;
        course1 = otherStudent.course1;
        course2 = otherStudent.course2;
    }

    /** generateID, creates string form of the number nextID */
    public static String generateID(int nextID) {

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

    public String extractEmail(String email) {

        if (isEmailValid(email)) {

            String sampleEmail;

            for (int i = 0; i < email.length(); i++) {

                if (email.charAt(i) == '@') {

                    char[] emailLetters = char[i];

                    for (int j = 0; j < emailLetters.length; j++) {

                        emailLetters[j] = email.charAt(j);
                    }
                } else {}
            }

            sampleEmail = String.valueOf(emailLetters);
            return sampleEmail;

        } else {
            
            return " ";
        }
    }

    /**
     * Verifies if the email is valid. conditions: must have '@', must have '.' and
     * they must respectively not be the first or last character of the email.
     */
    public boolean isEmailValid(String email) {

        boolean doesHaveAt = false; // does it have '@'?
        boolean doesHaveDot = false; // does it have '.'?

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                doesHaveAt = true;
            } else if (email.charAt(i) == '.') {
                doesHaveDot = true;
            } else {
            }
        }

        if (email.charAt(0) == '@') { // if the first character is '@', it becomes invalid.
            doesHaveAt = false;
        } else if (email.charAt(email.length() - 1) == '.') { // if the last charcater is '.', it becomes invalid.
            doesHaveDot = false;
        }

        return (doesHaveAt && doesHaveDot);
    }

    public String toString() {

        return "Name    : " + firstName + " " + lastName + "\n" +
                "ID      : " + ID + "\n" +
                "Age     : " + age + "\n" +
                "Email   : " + email + "\n" +
                "Course1 : " + course1.getCourseName() + "[" + course1.getCredit() + " credits]" + "\n" +
                "Course1 : " + course1.getCourseName() + "[" + course2.getCredit() + " credits]";
    }

    public boolean equals(Student otherStudent) {

        return (this.lastName == otherStudent.lastName && this.firstName == otherStudent.firstName
                && this.ID == otherStudent.ID && this.age == otherStudent.age && this.email == otherStudent.email &&
                this.course1 == otherStudent.course1 && this.course2 == otherStudent.course2);
    }

    /** Getters */
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getEmail() {

        return email;
    }

    public String getID() {

        return ID;
    }

    public int getAge() {

        return age;
    }

    public Course getCourse1() {

        return course1;
    }

    public Course getCourse2() {

        return course2;
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

    public void setAge(int newAge) {

        this.age = newAge;
    }

    public void setCourse1(Course newCourse1) {

        this.course1 = newCourse1;
    }

    public void setCourse2(Course newCourse2) {

        this.course2 = newCourse2;
    }
}