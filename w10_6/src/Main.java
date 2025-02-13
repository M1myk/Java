import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] intArray = {2,7,2,9,0};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        double[] doubleArray = {8.1,8.3,9.1,1.6,4.0};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));


        String[] stringArray = {"hello","world","cherry","banana"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}