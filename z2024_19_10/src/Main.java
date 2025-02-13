//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImmutableDate data1 = new ImmutableDate(2010, 11, 1);
        ImmutableDate data2 = new ImmutableDate(2012 , 6, 30);
        ImmutableDate data3 = new ImmutableDate(2012, 6, 15);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data1.equals(data2));
        System.out.println(data1.equals(data3));
        System.out.println(data2.equals(data3));
        System.out.println(data1.getYear());
    }
}