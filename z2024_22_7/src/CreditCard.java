import java.time.LocalDate;

public class CreditCard implements Cloneable {
    private String cardNumber;
    private String holdername;
    private LocalDate expiryDate;

    public CreditCard(String cardNumber, String holdername, LocalDate expiryDate)
    {
        this.cardNumber = cardNumber;
        this.holdername = holdername;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHoldername() {
        return holdername;
    }

    public void setHoldername(String holdername) {
        this.holdername = holdername;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", holdername='" + holdername + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
