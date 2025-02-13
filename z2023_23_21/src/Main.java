public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Pies", 17);
        Animal animal2 = new Animal("Kot", 11);
        Animal animal3 = new Animal("Slon", 38);
        Animal animal4 = new Animal("Mysza", 2);

        Dog dog1 = new Dog("Pies", 18);
        Dog dog2 = new Dog("Pies", 17);

        Animal animalMax1 = Animal.findMax(animal1, dog1); // pies 18
        System.out.println(animalMax1);

        Animal animalMax2 = Animal.findMax(dog1, dog2); // pies 18
        System.out.println(animalMax2);

        Animal animalMax3 = Animal.findMax(animal3, animal4); // slon 38
        System.out.println(animalMax3);

    }
}