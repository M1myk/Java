package university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args)
    {
        Student student1 = new Student("Dmytro", 4.2, 2024);
        Student student2 = new Student("Dmytro", 4.5, 2023);
        Student student3 = new Student("Dmytro", 4.2, 2023);
        Student student4 = new Student("Dmytro", 4.1, 2021);
        Student student5 = new Student("Dmytro", 4.5, 2022);


        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for(Student student : students)
        {
            System.out.println(student);
        }

        Collections.sort(students);
        System.out.println("-----------------------------");
        for(Student student : students)
        {
            System.out.println(student);
        }


    }
}
