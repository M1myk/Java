public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("pussy", 7);
        Animal dog = new Animal("Buddy", 12);

        Dog dog1 = new Dog("Buddy", 11);

        Pair<Animal> para1 = new Pair<>(cat, dog1);
        Pair<Animal> para2 = new Pair<>(dog, dog1);

        System.out.println(Pair.findMax(para1));
        System.out.println(Pair.findMax(para2));

    }
}