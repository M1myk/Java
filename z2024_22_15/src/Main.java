import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        try {
            List<Integer> grades = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                grades.add(i + 1);
            }

            Teacher teacher1 = new Teacher("Mr. Kowalski", grades);
            Teacher teacher2 = (Teacher) teacher1.clone();

            teacher1.setOceny(10, 99); // Zmieniamy ocenę na pozycji 10 oryginalnego nauczyciela

            System.out.println("Oryginalny nauczyciel: " + teacher1);
            System.out.println("Sklonowany nauczyciel: " + teacher2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}