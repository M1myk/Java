import java.util.Objects;

public class Contact {
    public int id;
    public String name;
    public String phone;


    public Contact(int id, String name, String phone)
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
    }
}
