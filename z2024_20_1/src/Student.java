public class Student implements Comparable<Student> {
    private String name;
    private double avarageGrade;
    private int yearOfBirth;


    public Student(String name, double avarageGrade, int yearOfBirth) {
        this.name = name;
        this.avarageGrade = avarageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int compareTo(Student o) {


        return Double.compare(this.avarageGrade, o.avarageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avarageGrade=" + avarageGrade +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
