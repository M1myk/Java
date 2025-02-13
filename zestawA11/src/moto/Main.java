package moto;

public class Main{
    public static void main(String[] args)
    {
        Vehicle[] vehicles ={
            new Vehicle("Mercedes", 220),
                    new Vehicle("BMW", 220),
                    new Vehicle("Akura", 250),
                    new Vehicle("BMW", 230),
                    new Vehicle("KIA", 250)};

        System.out.println(MaxValue(vehicles));

    }


    public static <T extends Comparable<T>> T MaxValue(T[] tab)
    {
        if(tab == null || tab.length == 0)
        {
            return null;
        }
        T max = tab[0];
        for(int i = 1; i < tab.length; i++)
        {
            if(max.compareTo(tab[i]) > 0)
            {
                max = tab[i];
            }
        }
        return max;
    }
}

