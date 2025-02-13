public class Client implements Comparable<Client>{
    private String lastName;
    private double balance;

    public Client(String lastName, double balance)
    {
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public int compareTo(Client o) {
        if(this.balance == o.balance)
        {
            return this.lastName.compareTo(o.lastName);
        }
        return Double.compare(this.balance, o.balance);
    }

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }
}
