package Student;

public class Main {
    
        public static void main(String[] args ) {

            Course course1 = new Course("Programming 1", 3, true);
        Course course2 = new Course(course1);

        Student student = new Student("Megane", "Kickouama", "megane.kickouama@gmail.com", 17, course1, course2);

        System.out.println(student);
        System.out.println(student.extractEmail());

    }
}
