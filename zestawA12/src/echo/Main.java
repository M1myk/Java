package echo;

public class Main {
    public static void main(String[] args)
    {
        Student student1 = new Student("Dmytro", 19);
        Student student2 = new Student("Dmytro", 20);
        Student student3 = new Student("Dmytro", 19);
        Student student4 = new Student("Dmytro", 19);

        echoIfEquivalent(student1, student3, student4);
        echoIfEquivalent(student2, student3, student4);
    }

    public static <T> void echoIfEquivalent(T a, T b, T c)
    {
        if(a.equals(b) && a.equals(c) )
        {
            System.out.println("Wszystkie trzy są równoważne");
        }
    }
}
