import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = generujTablice(10, 5, 20);
        wypiszLiniowo(tab);
        wypiszTablice(tab, 4, 3);

        ArrayList<Integer> tab1 = new ArrayList<>(Arrays.asList(9, 4, 3, 1));
        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(5);
        tab2.add(1);
        tab2.add(7);
        tab2.add(8);


        Collections.sort(tab1); // sortowanie
        Collections.sort(tab2);

        ArrayList<Integer> posortowane = mergeSortedLists(tab1, tab2);
        System.out.println(posortowane);

        String napis = "abba lubi srac";
        ArrayList<String> toArray = toArrayList(napis);
        System.out.println(toArray);

        int liczba = 543219;
        ArrayList<Integer> toArray1 = toArrayList(liczba);
        System.out.println(toArray1);

        char znak = 'b';
        int liczba1 = 3;

        boolean result = chekChar(toArray, znak);
        System.out.println("Czy znak '" + znak + "' jest w tablicy? " + result);
        countChar(toArray,znak);

        countChar(toArray1, liczba1);

        generateRandomDouble();

        ArrayList<Double> tablica_zmiennoprzecinkowa = new ArrayList<>(Arrays.asList(5.2, 1.55, 3.6, 0.1, 8.3, 0.3, 0.5, 0.4, 0.5, 1.0));
        obliczcos(tablica_zmiennoprzecinkowa);

        double[] tab4 = {2,4,8.8, 9.1, 5,0};
        double[] wynik4 = copyArray(tab4);
        System.out.println(Arrays.toString(wynik4));

        int[] wynik5 = copyArrayEven(tab);
        System.out.println(Arrays.toString(wynik5));
    }

    public static int[] generujTablice(int n, int min, int max) {
        Random rand = new Random();
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i] = rand.nextInt(max - min + 1) + min;
        }
        return tablica;
    }

    public static void wypiszLiniowo(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    public static void wypiszTablice(int[] tab, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int index = i * m + j;

                if (index >= tab.length) {
                    System.out.print("-- ");
                } else {
                    System.out.print(tab[index] + " ");
                }
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> result = new ArrayList<>(tab1);
        result.addAll(tab2);
        return result;
    }

    public static ArrayList<Integer> mergeSortedLists(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < tab1.size() && j < tab2.size()) {
            if (tab1.get(i) <= tab2.get(j)) {
                result.add(tab1.get(i));
                i++;
            } else {
                result.add(tab2.get(j));
                j++;
            }
        }

        // Add remaining elements from tab1
        while (i < tab1.size()) {
            result.add(tab1.get(i));
            i++;
        }

        // Add remaining elements from tab2
        while (j < tab2.size()) {
            result.add(tab2.get(j));
            j++;
        }

        return result;
    }

    public static ArrayList<String> toArrayList(String napis)
    {
        ArrayList<String> result = new ArrayList<>();

        char[] lista = napis.toCharArray();

        boolean zamieniono = true;
        while (zamieniono)
        {
            zamieniono = false;
            for (int i = 0; i < lista.length-1; i++)
            {

                if(lista[i] > lista[i+1])
                {
                    char temp = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = temp;
                    zamieniono = true;
                }

            }
        }

        for (int i = 0; i < lista.length; i++)
        {
            if(lista[i] != ' ')
                result.add(String.valueOf(lista[i]));
        }
        return result;
    }

    public static ArrayList<Integer> toArrayList(int liczba)
    {
        ArrayList<Integer> result = new ArrayList<>();

        String temp = Integer.toString(liczba);

        int[] lista = new int[temp.length()];

        for(int i = 0; i < temp.length(); i++)
        {

            lista[i] = Character.getNumericValue(temp.charAt(i));
        }


        boolean zamieniono = true;
        while (zamieniono)
        {
            zamieniono = false;
            for (int i = 0; i < lista.length-1; i++)
            {

                if(lista[i] > lista[i+1])
                {
                    int temp1 = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = temp1;
                    zamieniono = true;
                }

            }
        }

        for (int i = 0; i < lista.length; i++)
        {
            if(lista[i] != ' ')
            {
                result.add(lista[i]);
            }
        }
        return result;
    }

    public static void countChar(ArrayList<String> tab, char znak)
    {
        int count = 0;
        String znak1 = String.valueOf(znak);
        for (int i = 0; i < tab.size(); i++)
        {
            if(tab.get(i).equals(znak1))
                count++;
        }

        System.out.println(count);
    }

    public static void countChar(ArrayList<Integer> tab, int liczba)
    {
        int count = 0;

        for (int i = 0; i < tab.size(); i++)
        {
            if(tab.get(i).equals(liczba))
                count++;
        }

        System.out.println(count);
    }

    public static boolean chekChar(ArrayList<String> tab, char znak)
    {
        String znak1 = String.valueOf(znak);
        for(int i = 0; i < tab.size(); i++)
        {
            if(tab.get(i).equals(znak1))
            {
                return true;
            }

        }
        return false;
    }

    public static void generateRandomDouble()
    {
        Random rand = new Random();
        double liczba = rand.nextDouble(0.1,1);

        System.out.printf("%.3f%n  ",liczba);
    }

    public static void obliczcos(ArrayList<Double> tab)
    {
        double count = 0;
        for(int i = 0; i < tab.size(); i++)
        {
            if(tab.get(i) >0.5)                                         
            {                                           
                count+=tab.get(i);                                          
            }
        }
        System.out.println(count);
    }


    public static double[] copyArray(double[] tab)
    {
        double[] result =  Arrays.copyOf(tab, tab.length);
        return result;
    }

    public static int[] copyArrayEven(int[] tab)
    {
        int even = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] % 2 == 0)
            {
                even++;
            }
        }
        int index = 0;
        int[] result = new int[even];
        {
            for(int i = 0; i < tab.length; i++)
            {
                if(tab[i] % 2 == 0)
                {
                    result[index] = tab[i];
                    index++;
                }
            }
        }
        return result;
    }
}