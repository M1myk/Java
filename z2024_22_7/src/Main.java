import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("78fg4j0s7", "Dmytro", LocalDate.of(2006, 12,22));
        CreditCard creditCard2 = null;

        try
        {
            creditCard2 = (CreditCard) creditCard1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        creditCard2.setCardNumber("sikjfuiafhjaf");

        System.out.println(creditCard1);
        System.out.println(creditCard2);


    }
}