package university;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args)
    {
        Student student1 = new Student("Dmytro", 4.5);
        Student student2 = new Student("Dmytro1", 4.2);
        Student student3 = new Student("Dmytro2", 4.5);
        Student student4 = new Student("Dmytro", 4.5);

        Collection<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        System.out.println(countElements(students, student1));
    }

    public static <T> int countElements(Collection<T> items, T element)
    {
        int count = 0;

        for(T item : items)
        {
            if(item.equals(element))
            {
                count++;
            }
        }
        return count;
    }
}
