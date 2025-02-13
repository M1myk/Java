//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog[] dogs = {
                new Dog("A", 1),
                new Dog("B", 4),
                new Dog("C", 1),
                new Dog("D", 3)};

        Pair<Dog> result = new Pair<>(null, null);

        Pair.findMinMax(dogs, result);
        System.out.println(result);
    }
}