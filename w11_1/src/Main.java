import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("ALice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)};
        Arrays.sort(people);

        for(var elem : people)
        {
            System.out.println(elem);
        }

    }
}