import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();



        for(int i = 0; i < tab.size(); i++)
        {

            boolean unikalny = true;
            for(int j = 0; j < i; j++)
            {
                if (tab.get(i) == tab.get(j)) {

                    unikalny = false;
                    break;
                }
            }
            if(unikalny)
            {
                int licznik = 0;
                ArrayList<Integer> pom = new ArrayList<>();
                pom.add(tab.get(i));
                for(int k = 0; k < tab.size(); k++)
                {

                    if (tab.get(i) == tab.get(k))
                    {
                        licznik++;
                    }
                }
                pom.add(licznik);
                result.add(pom);
                            }

        }
        return result;
    }



    public static boolean isPalindrome(int liczba) {
        int original = liczba;
        int reversed = 0;

        while (liczba > 0) {
            int ostatniaCyfra = liczba % 10;
            reversed = reversed * 10 + ostatniaCyfra;
            liczba /= 10;
        }

        return original == reversed;
    }

    public static int podciag(int[] tab)
    {
        int count = 1;
        int max = 1;


        for(int i = 1; i < tab.length; i++)
        {
            if(tab[i] > tab[i-1])
            {
                count++;
            }
            else
            {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);

        return max;
    }


    public static void main(String[] args)
    {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(1);
        tab.add(2);
        tab.add(3);
        tab.add(1);
        tab.add(4);
        tab.add(2);
        tab.add(1);

        ArrayList<ArrayList<Integer>> result = uniqueArrayList(tab);
        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();

        boolean wynik = isPalindrome(liczba);
        System.out.println(": "+wynik);

        int[] tab1 = new int[10];
        tab1[0] = 1;
        tab1[1] = 2;
        tab1[2] = 3;
        tab1[3] = 2;
        tab1[4] = 5;
        tab1[5] = 6;
        tab1[6] = 7;
        tab1[7] = 8;
        tab1[8] = 9;
        tab1[9] = 1;

        System.out.println(podciag(tab1));


    }
}