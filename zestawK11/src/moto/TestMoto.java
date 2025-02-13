package moto;

public class TestMoto {
    public static void main(String[] args)
    {
        Integer[] tab = {3,8,9,3,2,7,9,3,1};
        System.out.println(lastMaxVaelue(tab));

    }
    public static <T extends Comparable<T>> T lastMaxVaelue(T[] tab)
    {
        if(tab == null || tab.length == 0)
        {
            throw new ArrayIndexOutOfBoundsException("tab is null or empty");
        }

        T max = tab[0];
        for (T t : tab) {
            if (max.compareTo(t) < 0) {
                max = t;
            }
        }
        return max;
    }
}
