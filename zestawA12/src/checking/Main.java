package checking;

import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        HashSet<String> set3 = new HashSet<>();
        set3.add("1");
        set3.add("2");
        set3.add("3");

        HashSet<String> set4 = new HashSet<>();
        set4.add("a");
        set4.add("3");
        set4.add("c");

        System.out.println(checkDisjoint(set1, set2));
        System.out.println(checkDisjoint(set3, set4));

    }

    public static <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2)
    {
        if(set1 == null || set2 == null)
        {
            throw new IllegalArgumentException("Nie moze byc nullem");
        }
        for(E e : set1)
        {
            for(E e2 : set2)
            {
                if(e.equals(e2))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
