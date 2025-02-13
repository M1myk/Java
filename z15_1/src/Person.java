public class Person {
    private String firstName;
    protected String LastName;


    public Person(String firstName, String LastName)
    {
        this.firstName = firstName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
