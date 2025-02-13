import java.util.Comparator;

public class TestMyComparator implements MyComparator {


    @Override
    public int compare(int a, int b) {
        return MyComparator.super.compare(a, b);
    }

    public static void main(String[] args)
    {
        TestMyComparator t = new TestMyComparator();
        System.out.println(t.compare(1, 2));
        System.out.println(t.compare(2, 1));
        System.out.println(t.compare(1, 1));
    }
}
