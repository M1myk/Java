package student;

public class TestStudentRecord {
    public static void main(String[] args)
    {
        StudentRecord student1 = new StudentRecord("Dmytro", 177295, 4.0);
        StudentRecord student2 = new StudentRecord("Dominik", 176835, 3.1);
        student1.printDetails();
        student2.printDetails();

        System.out.println(student1.isHonorStudent());
        System.out.println(student2.isHonorStudent());

    }
}


