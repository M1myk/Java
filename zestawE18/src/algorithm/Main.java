package algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> lista = new ArrayList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        Iterator<String> iterator = lista.iterator();
        System.out.println(atIndex(iterator, 5));

    }

    public static <T> T atIndex(Iterator<T> iterator, int index)
    {
        if(index < 0)
        {
            throw new IndexOutOfBoundsException("Index out of bounds!!!");
        }
        int index_number = 0;
        while (iterator.hasNext())
        {
            T element = iterator.next();
            if(index == index_number)
            {
                return element;
            }
            index_number++;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");

    }
}
