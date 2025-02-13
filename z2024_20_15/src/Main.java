import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(29, "Dmytro", 4.8));
        students.add(new Student(23, "Dominik", 4.8));
        students.add(new Student(21, "Dmytro", 4.3));
        students.add(new Student(27, "Krzysztof", 4.9));
        students.add(new Student(27, "Dmytro", 4.2));


        IdComparator idComparator = new IdComparator();
        Collections.sort(students, idComparator);

        AverageGradeComparator averageGradeComparator = new AverageGradeComparator();
        Collections.sort(students, averageGradeComparator);



        for (Student student : students)
        {
            System.out.println(student);
        }

    }
}