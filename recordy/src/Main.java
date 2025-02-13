

public class Main {
    public static void main(String[] args) {

        BookDTO book1 = new BookDTO("AA", "BB", 99.99, 2002);
        System.out.println(book1);
        System.out.println();

        Address address1 = new Address("Sloneczna", 54, "72-772", "Olsztyn");
        Person person1 = new Person("Alice", "Kowalska", address1);
        System.out.println(person1);

        Car lamba = new Car("LAmborgini", "Urus", 23.7);
        System.out.println(lamba);
        System.out.println(lamba.fuelCost(4.99, 328) + " $");
        System.out.println();

        Person1 person11 = new Person1("Jan", 23);
        Person1 person12 = new Person1("Jan", -5);
        System.out.println(person11);
        System.out.println(person12);
        System.out.println();

        BankAccount bank1 = new BankAccount("9473758294", 83284.92);
        BankAccount bank2 = new BankAccount("8573003");
        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println();


        MusicAlbum album1 = new MusicAlbum("Rok na niebie", "Ray Rolnold", 8.9);
        album1.dodajOcene(4.8);
        album1.dodajOcene(8.2);
        album1.dodajOcene(9.8);
        album1.dodajOcene(1.4);
        System.out.println(album1.getRatings());
        System.out.println();

        album1.usunOcene();
        album1.usunOcene();
        System.out.println(album1.getRatings());

        RockAlbum rockAlbum1 = new RockAlbum("Rok na niebie", "Ray Rolnold", "Rock");
        System.out.println(rockAlbum1);
        System.out.println(album1);

        System.out.println(album1.equals(rockAlbum1));
        System.out.println(album1.hashCode());
        System.out.println(rockAlbum1.hashCode());
        System.out.println(rockAlbum1.equals(album1));




    }
}