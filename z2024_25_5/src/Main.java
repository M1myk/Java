public class Main {
    public static <T extends Comparable<T>> T max(T[] tab)
    {
        T max = tab[0];
        for(int i = 1; i < tab.length; i++)
        {
            if(max.compareTo(tab[i]) < 0)
                max = tab[i];
        }
        return max;

    }

    public static void main(String[] args) {
        Integer[] tab = {1,2,11,4,5,6,7,8,9};

        System.out.println(max(tab));

    }
}