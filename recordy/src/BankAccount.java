public record BankAccount(String numerKonta, double saldo) {

    public BankAccount(String numerKonta) {
        this(numerKonta, 0.0);
    }

}
