package checking;

public class Main {
    public static void main(String[] args)
    {
        Integer a = 5;
        Integer b = 5;
        Integer c = 7;
        Integer d = 1;

        System.out.println(containsDuplicates(a,b,c));
        System.out.println(containsDuplicates(a,d,c));
    }

    public static <T> boolean containsDuplicates(T a, T b, T c)
    {
        if(a.equals(b) || a.equals(c) || b.equals(c))
        {
            return true;
        }
        return false;
    }
}
