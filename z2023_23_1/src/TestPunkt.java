public class TestPunkt {
    public static <T> boolean isEqual(T obj1, T obj2)
    {
        return obj1.equals(obj2);
    }

    public static void main(String[] args)
    {
        Box<String> box1 = new Box<>();
        box1.setObject("Object 1");
        System.out.println(box1.getObject());

        Box<Integer> box2 = new Box<>();
        box2.setObject(1);
        System.out.println(box2.getObject());

        Box<Integer> box3 = new Box<>();
        box3.setObject(2);
        System.out.println(box3.getObject());

        System.out.println(isEqual(box1.getObject(), box2.getObject()));

        Counter<String> counter1 = new Counter<>();
        counter1.add("Jablko");
        counter1.add("Winigrono");

        Counter<Integer> counter2 = new Counter<>();
        counter2.add(1);
        counter2.add(2);
        counter2.add(3);

        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());
    }
}
