public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Dmytro", 19, 4.5);
        Student student2 = null;
        try
        {

            student2 = (Student) student1.clone();
            student2.setGrade(3.0);

        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.getMessage());
        }


        System.out.println(student1);
        System.out.println(student2);


    }
}