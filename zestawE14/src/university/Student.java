package university;

public record Student(String name, double avarageGrade, int yearOfStudy) implements Comparable<Student> {


    @Override
    public int compareTo(Student o) {
        if(o.avarageGrade == avarageGrade)
        {
            return Integer.compare(yearOfStudy, o.yearOfStudy);
        }
        return Double.compare(o.avarageGrade, avarageGrade);
    }
}
