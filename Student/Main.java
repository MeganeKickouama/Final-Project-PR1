package Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/** @author Mégane Kickouama @2176328 */

public class Main {
        public static void main(String[] args) {

        Course course1 = new Course("Programming 1", 3, true);
        Course course2 = new Course(course1);

        Student student = new Student("Megane", "Kickouama", "megane.kickouama@gmail.com", 17, course1, course2);
        Student student2 = new Student(student);
        student2.setLastName("Kickouama1");

        System.out.println(student);
        System.out.println(student2);

        System.out.println(student.extractEmail());

    }

    @Test 
    public void testMain() {

        assertEquals("megane.kickouama", student.extractEmail());
    }
}
