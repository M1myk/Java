import otherpackage.*;

public class Main {
    public static void main(String[] args)
    {
        Person dziecko = new Person("Jan", "tajne_haslo");

        System.out.println(dziecko.name);
        dziecko.setPassword("nowe_tajne_haslo");
        System.out.println(dziecko.getPassword());



    }
}