import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna Kowalska", 4.8, 2001));
        students.add(new Student("Jan Nowak", 3.7, 2002));
        students.add(new Student("Marek Wiśniewski", 4.2, 2000));
        students.add(new Student("Ewa Zielińska", 5.0, 1999));
        students.add(new Student("Tomasz Lewandowski", 3.9, 2003));

        Collections.sort(students);

        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}