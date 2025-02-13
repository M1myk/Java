public class TestCounter {
    public static void main(String[] args)
    {
        Counter<String> counter1 = new Counter<>();
        counter1.add("A");
        counter1.add("B");
        Counter<Integer> counter2 = new Counter<>();
        counter2.add(6);
        counter2.add(7);
        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());


    }
}
