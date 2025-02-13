import java.util.*;

public class TestPunkt{
    public static <T> void printUnique(Collection<T> items)
    {
        Set<T> uniqueElements = new HashSet<>(items);
        for(T item : uniqueElements)
        {
            System.out.println(item);
        }
    }

    public static <T> int countOccurrences(Collection<T> items, T element)
    {
        int count = 0;
        for(T item : items)
        {
            if(item.equals(element))
            {
                count++;
            }
        }
        return count;
    }

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2)
    {
        ArrayList<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static <T> boolean isPalindrome(LinkedList<T> list)
    {
        if(list.size() % 2 == 0)
        {


            List<T> reversedList = new ArrayList<>(list);
            Collections.reverse(reversedList);
            return list.equals(reversedList);
        }
        else
        {

            List<T> reversedList = new ArrayList<>(list);
            Collections.reverse(reversedList);
            return list.equals(reversedList);
        }



    }

    public static <T extends Comparable<T>> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBound, T upperBound)
    {
        TreeSet<T> result = new TreeSet<>();
        for(T item : set)
        {
            if(item.compareTo(lowerBound) >= 0 && item.compareTo(upperBound) <= 0)
            {
                result.add(item);
            }
        }
        return result;
    }

    public static <T> HashSet<T> findUniqueElements(List<T> list)
    {
        return new HashSet<>(list);
    }








    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1, 1);
        System.out.println("Unikalne liczby:");
        printUnique(numbers);
        List<Double> numbers1 = Arrays.asList(1.0,2.0,1.0);
        System.out.println("Unikalne liczby:");
        printUnique(numbers1);
        System.out.println();

        System.out.println("Ilosc wystapien liczby 3");
        System.out.println(countOccurrences(numbers,3));

        TreeSet<Integer> lista_poczatkowa = new TreeSet<>();
        lista_poczatkowa.add(1);
        lista_poczatkowa.add(2);
        lista_poczatkowa.add(3);
        lista_poczatkowa.add(4);
        lista_poczatkowa.add(5);
        lista_poczatkowa.add(6);
        lista_poczatkowa.add(7);
        lista_poczatkowa.add(8);

        System.out.println("lista przedzialowa: " );
        System.out.println(findElementsInRange(lista_poczatkowa,2,6));

        LinkedList<String> sdsf = new LinkedList<>();
        sdsf.addLast("a");
        sdsf.addLast("b");
        sdsf.addLast("c");
        sdsf.addLast("d");
        sdsf.addLast("c");
        sdsf.addLast("b");
        sdsf.addLast("a");
        System.out.println(isPalindrome(sdsf));

        System.out.println("Unikalne liczby:");
        System.out.println(findUniqueElements(numbers));

    }


}
