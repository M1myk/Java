public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Tomek", 4),
                new Dog("Alibaba", 1),
                new Dog("Maks", 9),
                new Dog("Kubus", 5)
        };

        Pair<Dog> result = new Pair<>();

        AnimalsAvarage.findMinMax(dogs, result);
        System.out.println(result);
    }
}