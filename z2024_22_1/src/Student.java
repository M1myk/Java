public class Student  implements Cloneable{
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
