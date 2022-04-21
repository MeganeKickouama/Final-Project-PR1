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
        firstName = "";
        lastName = "";
        email = "";
        age = 0;
        course1 = new Course(); // only 1 course? or both courses?
        course2 = new Course();
    }
}