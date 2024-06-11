import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        Student third = new Student("martin");
        Student forth = new Student("julia");

        System.out.println(first.compareTo(second));
        System.out.println(third.compareTo(forth));
        studentList.add(forth);
        studentList.add(third);
        studentList.add(second);
        studentList.add(first);
        for (Student student : studentList) {
            System.out.println(student);
        }
        
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }


    }
}
