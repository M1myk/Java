import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(5,8,1));
        int[] grades1 = {5,8,2};
        Student student1 = new Student(null,grades);
        System.out.println(student1);

    }
}