import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Contact contact1 = new Contact(121,"Dmytro","+0983678123");
        Contact contact2 = new Contact(121,"Dmytro","+0983678123");

        System.out.println(contact1.hashCode());
        System.out.println(contact2.hashCode());
        System.out.println(contact1.equals(contact2));

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(contact1);


        System.out.println(contacts.contains(contact2));

        System.out.println(contacts.indexOf(contact2));

        System.out.println(contacts.size());

        System.out.println(contacts.remove(contact2));





    }
}