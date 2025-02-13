//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HeadTeacher headTeacher1 = new HeadTeacher("Pawel", 42, 5800.0, 500);
        Teacher teacher1 = new Teacher("Krzysztof", 38, 4800);
        HeadTeacher headTeacher2 = null;
        Teacher teacher2 = null;

        try
        {
            headTeacher2 = (HeadTeacher) headTeacher1.clone();
            teacher2 = (Teacher) teacher1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        headTeacher2.setBonus(800);
        teacher2.setName("Lolka");

        System.out.println(headTeacher1);
        System.out.println(teacher1);
        System.out.println(headTeacher2);
        System.out.println(teacher2);
    }
}